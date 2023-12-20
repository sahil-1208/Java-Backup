package com.learning.model;

public class Cast {
	private String actor;
	private String actress;
	private String director;
	public Cast(String actor, String actress, String director) {
		super();
		this.actor = actor;
		this.actress = actress;
		this.director = director;
	}
	
	public String getActor() {
		return actor;
	}

	public String getActress() {
		return actress;
	}

	public String getDirector() {
		return director;
	}

	@Override
	public String toString() {
		return "Cast [actor=" + actor + ", actress=" + actress + ", director=" + director + "]";
	}
	
	
}
