package controller;

import java.util.List;

import com.learning.model.Movie;

import service.Service;
import service.ServiceImpl;

public class Controller  {
	
	private Service service;
	
	public Controller() {
		this.service = new ServiceImpl();
	}
	
	public void post(Movie movie) {
		service.addMovie(movie);
	}
	
	public Movie getById(Long id) {
		return service.findMovieById(id);
	}
	
	public Movie getByName(String movieName) {
		return service.findMovieByName(movieName);
	}
	
	public Movie getByActorName(String actorName) {
		return service.findMovieByActorName(actorName);
	}
	
	public boolean deleteById(Long id) {
		return service.removeMovieById(id);
	}
	
	public boolean deleteByMovieName(String name) {
		return service.removeMovieByName(service.findMovieByName(name));
	}
	
	public boolean putMovie(Long id,Movie movie) {
		return service.updateMovie(id, movie);
	}
	
	public List<Movie> getAllMovies(){
		return service.findAllMovies();
	}

}
