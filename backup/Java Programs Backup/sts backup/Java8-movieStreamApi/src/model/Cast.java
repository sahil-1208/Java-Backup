package model;

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
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Cast [actor=" + actor + ", actress=" + actress + ", director=" + director + "]";
	}
	
}
