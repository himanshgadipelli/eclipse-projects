package org.java.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

@Entity
@Table(name="MOVIE_LIST")
@SecondaryTables({
    @SecondaryTable(name="MOVIE_RATING", pkJoinColumns={
        @PrimaryKeyJoinColumn(name="MOVIE_ID", referencedColumnName="Id") })
})

public class Movie {
	
	@Id @Column(name= "Id")
	private int id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Type")
	private String type;

	@Column(name="RATING", table="MOVIE_RATING")
	private String rating;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", Type=" + type + "]";
	}
    

}
//public class Movie (int Id, String Name, String Type){
//	int id;
//	String name;
//	String type;
//	this.id = Id;
//	this.name = Name;
//	this.type = Type;
//	
//}
