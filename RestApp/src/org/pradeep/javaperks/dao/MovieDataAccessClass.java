package org.pradeep.javaperks.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.pradeep.javaperks.model.Movie;

public class MovieDataAccessClass {

	public static Map<Integer, Movie> movies = new HashMap<>();

	public MovieDataAccessClass() {
		movies.put(1, new Movie(1, "AVATAR", "STEVEN", 400));
		movies.put(2, new Movie(2, "TITANIC", "STEVEN", 200));
	}

	public List<Movie> getAllMovies() {
		Collection<Movie> values = movies.values();
		List<Movie> moviesList = new ArrayList<Movie>(values);
		return moviesList;
	}

	public Movie getMovieById(int movieId) {
		return movies.get(movieId);
	}

	public void updateMovie(Movie movie) {

		int movieId = movie.getMovieId();
		movies.put(movieId, movie);
	}

	public Movie addMovie(Movie movie) {
		int size = movies.size();
		movie.setMovieId(size + 1);
		movies.put(size + 1, movie);
		return movie;
	}

	public Movie removeMovie(int movieId) {
		return movies.remove(movieId);
	}
}
