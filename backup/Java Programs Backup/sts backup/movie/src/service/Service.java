package service;

import java.util.List;

import entity.Movie;

public interface Service {
	public void addMovie(Movie movie);
	public Movie findMovieById(int id);
	public Movie findMovieByName(String movieName);
	public Movie findMovieByActorName(String actorName);
	public boolean removeMovie(int id);
	public boolean removeMovie(Movie movie);
	public boolean updateMovie(int id,Movie movie);
	public List<Movie> findAllMovies();
}
