package org.java.hibernate;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Values {
	public static Movie DefaultValues(Movie movie){
		movie.setName("Pellichupulu");
		movie.setId(13);
		movie.setType("Comedy");
		movie.setRating("8.7");
		return movie;
	}
	public static Movie UserValues(String name, int id, String type){
		Movie movie1 = new Movie();
		movie1.setName(name);
		movie1.setId(id);
		movie1.setType(type);
		return movie1;
	}
	public static void SaveMovie(Movie movie){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(movie);
		session.getTransaction().commit();
		session.close();
		System.out.println("Successfully saved");
	}
	public static void GetTable(){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("FROM Movie WHERE Id = 2");
	    java.util.List list = query.getResultList();
	    System.out.println(list);
		session.getTransaction().commit();
		session.close();
	}
	public static void ExecuteQuery(){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createSQLQuery("update MOVIE_LIST set Type = :Type" + " where Id = :Id");
		query.setParameter("Type", "Jack");
		query.setParameter("Id", 3);
		int result = query.executeUpdate();
		System.out.println("Executed");
		session.getTransaction().commit();
		session.close();
	}

}
