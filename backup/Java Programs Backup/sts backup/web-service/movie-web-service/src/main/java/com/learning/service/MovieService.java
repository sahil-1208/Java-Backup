package com.learning.service;

import java.util.List;

import com.learning.entity.Movie;

public interface MovieService {
	public void addMovie(Movie movie);
	public Movie findMovieById(int id);
	public Movie findMovieByName(String movieName);
	public Movie findMovieByActorName(String actorName);
	public boolean removeMovie(int id);
	public boolean removeMovie(Movie movie);
	public boolean updateMovie(int id,Movie movie);
	public List<Movie> findAllMovies();
}
