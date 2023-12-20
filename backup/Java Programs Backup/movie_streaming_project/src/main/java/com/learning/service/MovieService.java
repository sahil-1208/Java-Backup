package com.learning.service;

import java.util.List;

import com.learning.model.Movie;

public interface MovieService {
	void addMovie(Movie movie);

	Movie findMovieById(int id);

	Movie findMovieByName(String name);

	Movie findMovieByActorName(String actorName);

	boolean removeMovieById(int id);

	boolean removeMovieByName(Movie movie);

	boolean updateMovie(int id, Movie movie);

	List<Movie> findAllMovies();
}
