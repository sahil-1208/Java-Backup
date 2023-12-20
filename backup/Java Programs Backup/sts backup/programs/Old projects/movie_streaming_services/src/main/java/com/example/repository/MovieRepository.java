package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.enums.Status;
import com.example.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	List<Movie> findMovieByName(String name);

	//List<Movie> findMovieByActorName(String actorName);

	Status removeMovieByName(String movieName);

}
