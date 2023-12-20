package movieDataStream;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Service {

	public DataSource dataSource;
	
	public Service() {
		this.dataSource = new DataSource();
	}
	
	public void genericFilter(Predicate<Movie> predicate) {
		//Predicate<Movie> predicate = (movie -> movie.getLanguage().equals(language));
		Stream<Movie> streamOfMovie = dataSource.getMoviesStream();
		Stream<Movie> filteredMovies = streamOfMovie.filter(predicate);
		filteredMovies.forEach(movie -> System.out.println(movie));
	}
	
	/*public void filter(Language language) {
		Predicate<Movie> predicate = (movie -> movie.getLanguage().equals(language));
		Stream<Movie> streamOfMovie = dataSource.getMoviesStream();
		Stream<Movie> filteredMovies = streamOfMovie.filter(predicate);
		filteredMovies.forEach(movie -> System.out.println(movie));

	}

	public void languageType(Language language) {
		Stream<Movie> streamOfMovie = dataSource.getMoviesStream();
		Stream<Movie> filteredMovies = streamOfMovie.filter(movie -> movie.getLanguage().equals(language));
		filteredMovies.forEach(movie -> System.out.println(movie));

	}

	public void lengthType(double length) {
		Stream<Movie> streamOfMovie = dataSource.getMoviesStream();
		Stream<Movie> filteredMovies = streamOfMovie.filter(movie -> movie.getLength() == length);
		filteredMovies.forEach(movie -> System.out.println(movie));
	}

	public void genreType(Genre genre) {
		Stream<Movie> streamOfMovie = dataSource.getMoviesStream();
		Stream<Movie> filteredMovies = streamOfMovie.filter(movie -> movie.getGenre().equals(genre));
		filteredMovies.forEach(movie -> System.out.println(movie));
	}

	public void castType(String actor) {
		Stream<Movie> streamOfMovie = dataSource.getMoviesStream();
		Stream<Movie> filteredMovies = streamOfMovie.filter(movie -> movie.getCast().getActor().equalsIgnoreCase(actor));
		filteredMovies.forEach(movie -> System.out.println(movie));
	}*/

}
