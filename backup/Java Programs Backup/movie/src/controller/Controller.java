package controller;

import java.util.List;

import entity.Movie;
import service.Service;
import service.ServiceImpl;

public class Controller {
	
	private Service service;
	
//	public Controller() {
//		service = new ServiceImpl();
//	}
	
	public Controller(Service service) {
		super();
		this.service = service;
	}
		
	public void post(Movie movie) {
		service.addMovie(movie);
	}
	
	public Movie getById(int id) {
		return service.findMovieById(id);
	}
	
	public Movie getByName(String movieName) {
		return service.findMovieByName(movieName);
	}
	
	public Movie getByActorName(String actorName) {
		return service.findMovieByActorName(actorName);
	}
	
	public boolean deleteById(int id) {
		return service.removeMovie(id);
	}
	
	public boolean deleteByMovieName(String name) {
		return service.removeMovie(service.findMovieByName(name));
	}
	
	public boolean putMovie(int id,Movie movie) {
		return service.updateMovie(id, movie);
	}
	
	public List<Movie> getAllMovies(){
		return service.findAllMovies();
	}
}
