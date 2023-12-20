package model;

import enums.Genre;
import enums.Language;

public class Movie {
	private int id;
	private String name;
	private double movieLength;
	private Genre genre;
	private Language language;
	private Cast movieCast;
	private String movieUrl;

	public Movie(int id, String name, double movieLength, Genre genre, Language language, Cast movieCast,
			String movieUrl) {
		super();
		this.id = id;
		this.name = name;
		this.movieLength = movieLength;
		this.genre = genre;
		this.language = language;
		this.movieCast = movieCast;
		this.movieUrl = movieUrl;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getMovieLength() {
		return movieLength;
	}


	public void setMovieLength(double movieLength) {
		this.movieLength = movieLength;
	}


	public Genre getGenre() {
		return genre;
	}


	public void setGenre(Genre genre) {
		this.genre = genre;
	}


	public Language getLanguage() {
		return language;
	}


	public void setLanguage(Language language) {
		this.language = language;
	}


	public Cast getMovieCast() {
		return movieCast;
	}


	public void setMovieCast(Cast movieCast) {
		this.movieCast = movieCast;
	}


	public String getMovieUrl() {
		return movieUrl;
	}


	public void setMovieUrl(String movieUrl) {
		this.movieUrl = movieUrl;
	}


	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", movieLength=" + movieLength + ", genre=" + genre
				+ ", language=" + language + ", movieCast=" + movieCast + ", movieUrl=" + movieUrl + "]";
	}

}
