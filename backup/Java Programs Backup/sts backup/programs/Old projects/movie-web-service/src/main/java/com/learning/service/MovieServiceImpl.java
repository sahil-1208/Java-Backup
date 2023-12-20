package com.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.entity.Movie;
import com.learning.repository.Repository;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private Repository repository;
	
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
