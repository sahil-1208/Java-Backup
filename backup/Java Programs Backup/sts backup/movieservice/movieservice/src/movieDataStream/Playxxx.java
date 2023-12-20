package movieDataStream;

import java.util.function.Predicate;

import movieDataStream.enums.Genre;
import movieDataStream.enums.Language;

public class Playxxx {

	public static void main(String[] args) {
		Service service = new Service();
		FilterType filterType = new FilterType();
		filterType.setActor("SRK");
		
		Predicate<Movie> predicate = findPredicate("cast",filterType );
		service.genericFilter(predicate);
	}

	private static Predicate<Movie> findPredicate(String typeOfPredicate, FilterType filterType) {
		Predicate<Movie> predicate = null;
		switch (typeOfPredicate) {
			case "language":
				predicate = (movie -> movie.getLanguage().equals(filterType.getLanguage()));
				break;
			case "length":
				predicate = (movie -> movie.getLength() == filterType.getLength());
				break;
			case "genre":
				predicate = (movie -> movie.getGenre().equals(filterType.getGenre()));
				break;
			case "cast":
				predicate = (movie -> movie.getCast().getActor().equalsIgnoreCase(filterType.getActor()));
				break;
		}
		return predicate;
	}

	private static void previousCode() {
		Predicate<Movie> languagePredicate = (movie -> movie.getLanguage().equals(Language.HINDI));
		Predicate<Movie> lengthPredicate = (movie -> movie.getLength() == 99.43);
		Predicate<Movie> genrePredicate = (movie -> movie.getGenre().equals(Genre.ACTION));
		Predicate<Movie> castPredicate = (movie -> movie.getCast().getActor().equalsIgnoreCase("SRK"));

		Service service = new Service();
		// service.languageType(Language.HINDI);
		// service.filter(Language.HINDI);
		// service.genericFilter((movie -> movie.getLanguage().equals(Language.HINDI)));
		// service.genericFilter((movie -> movie.getLength() == 99.43));
		// service.genericFilter((movie -> movie.getGenre().equals(Genre.ACTION)));
		// service.genericFilter((movie ->
		// movie.getCast().getActor().equalsIgnoreCase("SRK")));
		// service.lengthType(99.43);
		// service.genreType(Genre.MYSTERY);
		// service.castType(null);

		service.genericFilter(languagePredicate);
		service.genericFilter(lengthPredicate);
		service.genericFilter(genrePredicate);
		service.genericFilter(castPredicate);
	}
}
