package com.movie.repository;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower


import java.util.List;
import com.movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findMovieByName(String movieName);

    List<Movie> findMovieByActorName(String actorName);

    boolean removeMovieByName(String movieName);
}
