package org.pradeep.javaperks.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Movie {
	
	int movieId;
	String movieName, actorName;
	double budget;
	
	public Movie(){
		
	}
	
	public Movie(int movieId, String movieName, String actorName, double budget){
		this.movieId=movieId;
		this.movieName=movieName;
		this.actorName=actorName;
		this.budget= budget;
	}
	
	
	
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getActorName() {
		return actorName;
	}
	public void setActorName(String actorName) {
		this.actorName = actorName;
	}
	 
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	

}
