package com.learning.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "movieClient", url = "http://localhost:8080/movie")
public interface MovieClient {
	
	@GetMapping
	public List<Movie> getAllMovies();
	
	@GetMapping("/actor-name/{actorName}")
	public Movie getByActorName(@PathVariable String actorName);
}
