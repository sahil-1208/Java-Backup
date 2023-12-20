package service;

import java.util.List;

import entity.Movie;
import repository.Repository;
import repository.RepositoryImpl;

public class ServiceImpl implements Service {
	private Repository repository;
	
	public ServiceImpl(Repository repository) {
			super();
			this.repository = repository;
		}

//	public ServiceImpl() {
//		repository = new RepositoryImpl(); 
//	}
	@Override
	public void addMovie(Movie movie) {
		repository.addMovie(movie);
	}

	@Override
	public Movie findMovieById(int id) {
		return repository.findMovieById(id);
	}

	@Override
	public Movie findMovieByName(String movieName) {
		return repository.findMovieByName(movieName);
	}

	@Override
	public Movie findMovieByActorName(String actorName) {
		return repository.findMovieByActorName(actorName);
	}

	@Override
	public boolean removeMovie(int id) {
		return repository.removeMovie(id);
	}

	@Override
	public boolean removeMovie(Movie movie) {
		return repository.removeMovie(movie);
	}

	@Override
	public boolean updateMovie(int id, Movie movie) {
		return repository.updateMovie(id, movie);
	}

	@Override
	public List<Movie> findAllMovies() {
		return repository.findAllMovies();
	}

}
