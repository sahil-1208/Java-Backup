package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.enums.Status;
import com.example.model.Movie;
import com.example.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	
	@Autowired
	private MovieService movieService;

	@PostMapping
	public void postMovie(@RequestBody Movie movie) {
		this.movieService.addMovie(movie);
	}

	@GetMapping({ "/{id}" })
	public Movie getById(@PathVariable Long id) {
		return this.movieService.findMovieById(id);
	}

	@GetMapping({ "/movie-name/{movieName}" })
	public List<Movie> getMovieByName(String name) {
		return this.movieService.findMovieByName(name);
	}

	/*@GetMapping({ "/actor-name/{actorName}" })
	public List<Movie> getMovieByActorName(String actorName) {
		return this.movieService.findMovieByActorName(actorName);
	}*/

	@DeleteMapping({ "/{id}" })
	public Status deleteMovieById(Long id) {
		return this.movieService.removeMovie(id);
	}

	@DeleteMapping({ "/movie-name/{movieName}" })
	public Status deleteMovieByName(String movieName) {
		return this.movieService.removeMovieByName(movieName);
	}

	@PutMapping({ "/{id}" })
	public Status updateMovie(Long id, Movie movie) {
		return this.movieService.updateMovie(id, movie);
	}

	@GetMapping
	public List<Movie> getAllMovies() {
		return this.movieService.findAllMovies();
	}

}
