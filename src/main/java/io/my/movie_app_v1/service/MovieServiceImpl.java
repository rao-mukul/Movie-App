package io.my.movie_app_v1.service;

import io.my.movie_app_v1.dao.MovieDao;
import io.my.movie_app_v1.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    MovieDao movieDao;

    @Override
    public String createMovie(Movie movie) {
        movieDao.saveMovie(movie);
        return "Movie Saved Successfully";
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieDao.getAllMovies();
    }

    @Override
    public Movie getById(int movieId) {
        return movieDao.getMovieById(movieId);
    }

    @Override
    public String deleteById(int id) {
        return movieDao.deleteMovieById(id);
    }

    @Override
    public Movie updateById(int id, Movie movie) {
        return movieDao.updateById(id,movie);
    }

    @Override
    public List<Movie> sortByRating() {
        List<Movie> ls = movieDao.getAllMovies();
        // Sorting based on Rating using a custom comparator
        ls.sort(Comparator.comparingDouble(Movie::getMovieRating));
        return ls;
    }

    @Override
    public List<Movie> sortByYear() {
        List<Movie> ls = movieDao.getAllMovies();
        // Sorting based on Rating using a custom comparator
        ls.sort(Comparator.comparing(Movie::getReleaseYear));
        return ls;
    }

    @Override
    public List<Movie> filterByGenre(String genre) {
        List<Movie> movieList = movieDao.getAllMovies();
        List<Movie> filterList = new ArrayList<>();
        for (Movie movie : movieList){
            if (movie.getGenre().equals(genre)){
                filterList.add(movie);
            }
        }
        System.out.println(filterList);
        return filterList;
    }
}
