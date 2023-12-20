package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.enums.Status;
import com.example.model.Movie;
import com.example.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
    private MovieRepository movieRepository;
	
    public void addMovie(Movie movie) {
        this.movieRepository.save(movie);
    }

    public Movie findMovieById(Long id) {
        Optional<Movie> optionalMovie = this.movieRepository.findById(id);
        boolean isPresent = optionalMovie.isPresent();
        if (isPresent) {
            Movie movie = (Movie)optionalMovie.get();
            return movie;
        } else {
            return null;
        }
    }

    public List<Movie> findMovieByName(String name) {
        List<Movie> movieList = this.movieRepository.findMovieByName(name);
        return movieList;
    }

   /* public List<Movie> findMovieByActorName(String actorName) {
        List<Movie> movieListByActor = this.movieRepository.findMovieByActorName(actorName);
        return movieListByActor;
    }*/

    public Status removeMovie(Long id) {
        this.movieRepository.deleteById(id);
        return Status.SUCCESS;
    }

    public Status removeMovieByName(String movieName) {
        this.movieRepository.removeMovieByName(movieName);
        return Status.SUCCESS;
    }

    public Status updateMovie(Long id, Movie movie) {
        Movie storedMovie = this.findMovieById(id);
        if (storedMovie != null) {
            storedMovie.setName(movie.getName());
            storedMovie.setLength(movie.getLength());
            storedMovie.setLanguage(movie.getLanguage());
            storedMovie.setGenre(movie.getGenre());
            storedMovie.setMovieCast(movie.getMovieCast());
            return Status.SUCCESS;
        } else {
            return Status.FAILED;
        }
    }

    public List<Movie> findAllMovies() {
        List<Movie> allMoviesList = this.movieRepository.findAll();
        return allMoviesList;
    }
}
