package io.my.movie_app_v1.service;

import io.my.movie_app_v1.entity.Movie;

import java.util.List;

public interface MovieService {
    public String createMovie(Movie movie);

    List<Movie> getAllMovies();

    Movie getById(int movieId);

    String deleteById(int id);

    Movie updateById(int id, Movie movie);

    List<Movie> sortByRating();

    List<Movie> sortByYear();

    List<Movie> filterByGenre(String genre);
}
