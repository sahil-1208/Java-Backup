package com.movie.service;

import com.movie.model.Movie;

import java.util.List;

public interface MovieService {
    void addMovie(Movie movie);

    Movie findMovieById(Long id);

    List<Movie> findMovieByName(String movieName);

    List<Movie> findMovieByActorName(String actorName);

    boolean removeMovie(Long id);

    boolean removeMovieByName(String movieName);

    boolean updateMovie(Long id, Movie movie);

    List<Movie> findAllMovies();

}
