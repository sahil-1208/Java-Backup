package movieDataStream;

import movieDataStream.enums.Genre;
import movieDataStream.enums.Language;

public class Movie {

	private long id;
	private String name;
	private Language language;
	private Genre genre;
	private double length;
	private Cast cast;

	public Movie(long id, String name, Language language, Genre genre, double length, Cast cast) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.genre = genre;
		this.length = length;
		this.cast = cast;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public Cast getCast() {
		return cast;
	}

	public void setCast(Cast cast) {
		this.cast = cast;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", language=" + language + ", genre=" + genre + ", length="
				+ length + ", cast=" + cast + "]";
	}

}
