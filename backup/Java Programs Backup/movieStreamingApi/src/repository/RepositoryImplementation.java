package repository;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

import model.Movie;

public class RepositoryImplementation implements Repository {

	private List<Movie> listOfMovies;

	public RepositoryImplementation() {
		this.listOfMovies = new LinkedList();
	}

	@Override
	public void addMovie(Movie movie) {
		listOfMovies.add(movie);
	}

	@Override
	public Movie findMovieById(Long id) {
		Stream<Movie> streamOfMovies = listOfMovies.stream();
		streamOfMovies = streamOfMovies.filter(movie -> movie.getId() == id);
		Optional<Movie> optionalStream = streamOfMovies.findFirst();
		boolean movieIsAvailable = optionalStream.isPresent();
		if (movieIsAvailable) {
			Movie movie = optionalStream.get();
			return movie;
		}
		return null;
	}

	@Override
	public Movie findMovieByName(String name) {
		Stream<Movie> streamOfMovies = listOfMovies.stream();
		streamOfMovies = streamOfMovies.filter(movie -> movie.getName().equals(name));
		Optional<Movie> optionalStream = streamOfMovies.findFirst();
		boolean movieIsAvailable = optionalStream.isPresent();
		if (movieIsAvailable) {
			Movie movie = optionalStream.get();
			return movie;
		}

		return null;
	}

	@Override
	public boolean removeMovieById(Long id) {
		Movie movie = findMovieById(id);
		if (Objects.nonNull(movie)) {
			listOfMovies.remove(movie);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeMovieByName(Movie movie) {
		if (Objects.nonNull(movie)) {
			listOfMovies.remove(movie);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateMovie(long id, Movie movie) {
				listOfMovies.set( (int) id , movie);
		return false;
	}

	@Override
	public List<Movie> findAllMovies() {
		return listOfMovies;
	}

	@Override
	public Movie findMovieByActorName(String actorName) {
		Stream<Movie> streamOfMovies = listOfMovies.stream();
		streamOfMovies = streamOfMovies.filter(movie -> movie.getMovieCast().getActor().equals(actorName));
		Optional<Movie> optionalStream = streamOfMovies.findFirst();
		boolean movieIsAvailable = optionalStream.isPresent();
		if (movieIsAvailable) {
			Movie movie = optionalStream.get();
			return movie;
		}

		return null;
	}

}
