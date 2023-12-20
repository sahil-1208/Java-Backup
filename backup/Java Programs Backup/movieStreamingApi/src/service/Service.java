package service;

import java.util.List;

import model.Movie;

public interface Service {
	 void addMovie(Movie movie);
	public Movie findMovieById(Long id);
	public Movie findMovieByName(String movieName);
	public Movie findMovieByActorName(String actorName);
	public List<Movie> findAllMovies();
	public boolean removeMovieById(Long id);
	public boolean removeMovieByName(Movie movie);
	public boolean updateMovie(long id, Movie movie);
}


