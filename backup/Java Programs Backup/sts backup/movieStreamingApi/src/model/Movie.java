package model;

import enums.Genre;
import enums.Language;
import model.Cast;

public class Movie {
	private Long id;
	private String name;
	private Language movieLanguage;
	private Genre movieGenre;
	private double length;
	private Cast movieCast;

	Movie(Long id, String name, Language movieLanguage, Genre movieGenre, double length, Cast movieCast) {
		super();
		this.id = id;
		this.name = name;
		this.movieLanguage = movieLanguage;
		this.movieGenre = movieGenre;
		this.length = length;
		this.movieCast = movieCast;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Language getMovieLanguage() {
		return movieLanguage;
	}

	public void setMovieLanguage(Language movieLanguage) {
		this.movieLanguage = movieLanguage;
	}

	public Genre getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(Genre movieGenre) {
		this.movieGenre = movieGenre;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public Cast getMovieCast() {
		return movieCast;
	}

	public void setMovieCast(Cast movieCast) {
		this.movieCast = movieCast;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", movieLanguage=" + movieLanguage + ", movieGenre=" + movieGenre
				+ ", length=" + length + ", movieCast=" + movieCast + "]";
	}

}
