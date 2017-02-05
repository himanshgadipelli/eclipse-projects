package org.pradeep.javaperks.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.pradeep.javaperks.dao.MovieDataAccessClass;
import org.pradeep.javaperks.model.Movie;

@Path("/movies")

public class MovieResource {
	
	MovieDataAccessClass movieResource = new MovieDataAccessClass();
	@Path("/{movieId}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Movie getMovieById(@PathParam("movieId") int movieId){
		return movieResource.getMovieById(movieId);
	}
	@GET 
	@Produces(MediaType.APPLICATION_JSON)
	public List<Movie> getAllMovies(){
		return movieResource.getAllMovies();
	}
	@POST
	public Movie updateMovie(Movie movie){
		movieResource.updateMovie(movie);
		return movie;
	}
	public Movie removeMovie(int movieId){
		return movieResource.removeMovie(movieId);
	}

}
