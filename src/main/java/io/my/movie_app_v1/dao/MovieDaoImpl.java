package io.my.movie_app_v1.dao;

import io.my.movie_app_v1.entity.Movie;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieDaoImpl implements MovieDao{

    @Autowired
    EntityManager entityManager;

    @Override
    @Transactional
    public void saveMovie(Movie movie) {
        entityManager.persist(movie);
    }

    @Override
    @Transactional
    public Movie getMovieById(int movieId) {
        return entityManager.find(Movie.class,movieId);
    }

    @Override
    @Transactional
    public List<Movie> getAllMovies() {
//        return null;
        Query query = entityManager.createQuery("select e from Movie e");
        List<Movie> movieList = query.getResultList();
        return movieList;
    }


    @Override
    @Transactional
    public String deleteMovieById(int movieId) {
        Movie movie = getMovieById(movieId);
        entityManager.remove(movie);
        return "Deleted Successfully";
    }

    @Override
    @Transactional
    public Movie updateById(int id, Movie movie) {
        Movie oldMovie = getMovieById(id);
        oldMovie.setMovieName(movie.getMovieName());
        oldMovie.setMovieRating(movie.getMovieRating());
        oldMovie.setReleaseYear(movie.getReleaseYear());
        entityManager.merge(oldMovie);
        return getMovieById(id);
    }
}
