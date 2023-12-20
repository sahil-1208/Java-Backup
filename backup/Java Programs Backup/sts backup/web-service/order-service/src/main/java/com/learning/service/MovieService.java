package com.learning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.client.Movie;
import com.learning.client.MovieClient;

@Service
public class MovieService {
	
	@Autowired
	private MovieClient movieClient;
	
	public List<Movie> findAllMovies() {
		return movieClient.getAllMovies();
	}
	
	public Movie getByActorName(String actorName) {
		return movieClient.getByActorName(actorName);
	}

}
