package Service;

import java.util.function.Predicate;
import java.util.stream.Stream;

import dataSource.DataSource;
import enums.Genre;
import enums.Language;
import model.Movie;

public class Service {

	public DataSource dataSource;

	public Service() {
		this.dataSource = new DataSource();
	}
	
	public void filter(Predicate<Movie> predicate) {
		Stream<Movie> streamOfMovies = dataSource.getMoviesStream();
		Stream<Movie> filteredMoviesStream = streamOfMovies.filter(predicate);
		filteredMoviesStream.forEach((filterdMovie) ->{System.out.println(filterdMovie);});
		
	}

	
	//previous code
	
	/* public void moviesProcessingByLanguage(Language language) {
		Stream<Movie> streamOfMovies = dataSource.getMoviesStream();
		Stream<Movie> streamOfLanguageMovies = streamOfMovies.filter((movie) -> {
			return movie.getLanguage().equals(language);
		});
		streamOfLanguageMovies.forEach((moviesLanguage) -> {
			System.out.println(moviesLanguage);
		});
	}

	public void moviesProcessingByGenre(Genre genre) {
		Stream<Movie> streamOfMovies = dataSource.getMoviesStream();
		Stream<Movie> streamOfGenreMovies = streamOfMovies.filter((movie) -> {
			return movie.getGenre().equals(genre);
		});
		streamOfGenreMovies.forEach((moviesGenre) -> {
			System.out.println(moviesGenre);
		});
	}

	public void moviesProcessingByLength(double length) {
		Stream<Movie> streamOfMovies = dataSource.getMoviesStream();
		Stream<Movie> streamOfMoviesLength = streamOfMovies.filter((movie) -> {
			return movie.getMovieLength() < length;
		});
		streamOfMoviesLength.forEach((moviesLength) -> {
			System.out.println(moviesLength);
		});
	}

	public void moviesProcessingByCast(String actor) {
		Stream<Movie> streamOfMovies = dataSource.getMoviesStream();
		Stream<Movie> streamOfMoviesCast = streamOfMovies.filter((movie) -> {
			return movie.getMovieCast().getActor().equalsIgnoreCase(actor);
		});
		streamOfMoviesCast.forEach((moviesCast) -> {
			System.out.println(moviesCast);
		});
	}

	public void moviesProcessingByUrl(String url) {
		Stream<Movie> streamOfMovies = dataSource.getMoviesStream();
		Stream<Movie> streamOfUrl = streamOfMovies.filter((movie) -> {
			return movie.getMovieUrl().equals(url);
		});
		streamOfUrl.forEach((moviesUrl) -> {
			System.out.println(moviesUrl);
		});
	}*/

//	public void HindiMoviesLanguageProcessinng() {
//		Stream<Movie> streamOfMovies = dataSource.getMoviesStream();
//		Stream<Movie> streamOfHindiMovies = streamOfMovies.filter((movie) -> {
//			return movie.getLanguage().equals(Language.HINDI);
//		});
//		streamOfHindiMovies.forEach((hindiMovies) -> {
//			System.out.println(hindiMovies);
//		});
//	}
//
//	public void PunjabiMoviesLanguageProcessinng() {
//		Stream<Movie> streamOfMovies = dataSource.getMoviesStream();
//		Stream<Movie> streamOfPunjabiMovies = streamOfMovies.filter((movie) -> {
//			return movie.getLanguage().equals(Language.PUNJABI);
//		});
//		streamOfPunjabiMovies.forEach((punjabiMovies) -> {
//			System.out.println(punjabiMovies);
//		});
//	}
}
