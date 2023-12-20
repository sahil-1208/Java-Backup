package repository;

import java.util.List;

import model.Movie;

public interface Repository {
	void addMovie(Movie movie);
	public Movie findMovieById(Long id);
	public Movie findMovieByName(String name);
	public Movie findMovieByActorName(String actorName);
	public boolean removeMovieById(Long id);
	public boolean removeMovieByName(Movie movie);
	public boolean updateMovie(long id , Movie movie);
	public List<Movie> findAllMovies();

}
