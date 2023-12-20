package com.learning.repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.learning.entity.Movie;


@Component
public class RepositoryImpl implements Repository {

	private List<Movie> listOfMovies;

	public RepositoryImpl() {
		listOfMovies = new LinkedList<Movie>();
	}

	@Override
	public void addMovie(Movie movie) {
		listOfMovies.add(movie);
	}

	@Override
	public Movie findMovieById(int id) {
		Stream<Movie> streamMovie = listOfMovies.stream();
		streamMovie = streamMovie.filter(movie -> movie.getId() == id);
		Optional<Movie> optionalMovies = streamMovie.findFirst();
		boolean isMovieAvailable = optionalMovies.isPresent();
		if (isMovieAvailable) {
			Movie movie = optionalMovies.get();
			return movie;
		}
		return null;
	}

	@Override
	public Movie findMovieByName(String movieName) {
		Optional<Movie> optionalMovies = listOfMovies.stream()
				.filter(movie -> movie.getName().equalsIgnoreCase(movieName))
				.findFirst();
		if (optionalMovies.isPresent()) {
			return optionalMovies.get();
		}
		return null;
	}

	@Override
	public Movie findMovieByActorName(String actorName) {
		Optional<Movie> optionalMovies = listOfMovies.stream()
				.filter(movie -> movie.getCast().getActor().equalsIgnoreCase(actorName))
				.findFirst();
		if (optionalMovies.isPresent()) {
			return optionalMovies.get();
		}
		return null;
	}

	@Override
	public boolean removeMovie(int id) {
		Movie movie = findMovieById(id);
		if(Objects.nonNull(movie)) {
			listOfMovies.remove(movie);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeMovie(Movie movie) {
		if(Objects.nonNull(movie)) {
			listOfMovies.remove(movie);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateMovie(int id, Movie movie) {
		if(Objects.nonNull(findMovieById(id))) {
			listOfMovies.set(listOfMovies.indexOf(findMovieById(id)), movie);
			return true;
		}
		return false;
	}

	@Override
	public List<Movie> findAllMovies() {
		return listOfMovies;
	}

}
