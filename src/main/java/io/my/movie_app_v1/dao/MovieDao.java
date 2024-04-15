package io.my.movie_app_v1.dao;

import io.my.movie_app_v1.entity.Movie;

import java.util.List;

public interface MovieDao {
    public void saveMovie(Movie movie);
    public Movie getMovieById(int movieId);
    public List<Movie> getAllMovies();
    public String deleteMovieById(int movieId);

    Movie updateById(int id, Movie movie);
}
