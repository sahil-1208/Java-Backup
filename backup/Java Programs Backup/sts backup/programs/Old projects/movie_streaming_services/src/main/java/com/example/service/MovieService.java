package com.example.service;

import java.util.List;

import com.example.enums.Status;
import com.example.model.Movie;

public interface MovieService {
	
	void addMovie(Movie movie);

    Movie findMovieById(Long id);

    List<Movie> findMovieByName(String name);

   // List<Movie> findMovieByActorName(String actorName);

    Status removeMovie(Long id);

    Status removeMovieByName(String movieName);

    Status updateMovie(Long id, Movie movie);

    List<Movie> findAllMovies();
}
