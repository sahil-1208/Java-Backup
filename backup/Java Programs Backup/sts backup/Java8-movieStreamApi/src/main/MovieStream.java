package main;

import java.util.function.Predicate;

import Service.Service;
import enums.Genre;
import enums.Language;
import model.FilterType;
import model.Movie;

public class MovieStream {

	public static void main(String[] args) {
		FilterType filterType= new FilterType();
		filterType.setActor("Diljit Dosanjh");
		filterType.setGenre(Genre.ADULT);
		filterType.setLanguage(Language.PUNJABI);
		Service service = new Service();

		Predicate<Movie> genre = findPredicate("genre", filterType);
		service.filter(genre);
		
		Predicate<Movie> cast = findPredicate("cast", filterType);
		service.filter(cast);
		
		Predicate<Movie> language = findPredicate("language", filterType);
		service.filter(language);
		
		
		/*System.out.println("Movies By Langauge");
		service.moviesProcessingByLanguage(Language.PUNJABI);
		System.out.println("Movies By Length");
		service.moviesProcessingByLength(2.00);
		System.out.println("Movies By Genre");
		service.moviesProcessingByGenre(Genre.ADULT);
		System.out.println("Movies By Cast");
		service.moviesProcessingByCast("Diljit Dosanjh");
		System.out.println("Movies By Url");
		service.moviesProcessingByUrl("https://youtu.be/0owS3euUNtk");*/
	}
	
	private static Predicate<Movie> findPredicate (String typeOfPredicate, FilterType filterType) {
		Predicate<Movie> predicate = null;

		switch (typeOfPredicate) {

		case "language":
			predicate = (movie -> movie.getLanguage().equals(filterType.getLanguage()));
			break;

		case "length":
			predicate = (movie -> movie.getMovieLength() == filterType.getLength());
			break;

		case "genre":
			predicate = ((movie) -> movie.getGenre().equals(filterType.getGenre()));
			break;

		case "cast":
			predicate = ((movie) -> movie.getMovieCast().getActor().equals(filterType.getActor()));
			break;

		case "url":
			predicate = ((movie) -> movie.getMovieUrl().equals(filterType.getUrl()));
			break;

		}
		return predicate;
								
	}

}