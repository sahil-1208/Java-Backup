package service;

import java.util.List;

import model.Movie;
import repository.Repository;
import repository.RepositoryImplementation;

public class ServiceImpl implements Service {

	private Repository repository;

	public ServiceImpl() {
		this.repository = new RepositoryImplementation();
	}

	@Override
	public void addMovie(Movie movie) {
		repository.addMovie(movie);
	}

	@Override
	public Movie findMovieById(Long id) {
		return repository.findMovieById(id);

	}

	@Override
	public Movie findMovieByName(String name) {
		return repository.findMovieByName(name);
	}

	@Override
	public Movie findMovieByActorName(String actorName) {
		return repository.findMovieByActorName(actorName);
	}

	@Override
	public boolean removeMovieById(Long id) {
		return repository.removeMovieById(id);
	}

	@Override
	public boolean removeMovieByName(Movie movie) {
		return repository.removeMovieByName(movie);
	}

	@Override
	public boolean updateMovie(long id, Movie movie) {
		return repository.updateMovie(id, movie);
	}

	@Override
	public List<Movie> findAllMovies() {
		return repository.findAllMovies();
	}

}
