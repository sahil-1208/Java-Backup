package com.learning.client;

import com.learning.enums.Genre;
import com.learning.enums.Language;

public class Movie {
	private int id;
	private String name;
	private Language language;
	private Genre genre;
	private int length;
	private Cast cast;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Language getLanguage() {
		return language;
	}
	public Genre getGenre() {
		return genre;
	}
	public int getLength() {
		return length;
	}
	public Cast getCast() {
		return cast;
	}
	public Movie(int id, String name, Language language, Genre genre, int length, Cast cast) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.genre = genre;
		this.length = length;
		this.cast = cast;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", language=" + language + ", genre=" + genre + ", length="
				+ length + ", cast=" + cast.toString() + "]";
	}
}
