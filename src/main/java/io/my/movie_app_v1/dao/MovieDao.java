package io.my.movie_app_v1.dao;

import io.my.movie_app_v1.entity.Movie;

import java.util.List;

public interface MovieDao {
    void saveMovie(Movie movie);
    Movie getMovieById(int movieId);
    List<Movie> getAllMovies();
    String deleteMovieById(int movieId);

    Movie updateById(int id, Movie movie);
}
