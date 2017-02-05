package org.java.hibernate;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Values {
	public static Student DefaultValues(Student student){
		student.setName("Ramesh");
		student.setRoll("101");
		student.setDegree("M.E");
		student.setPhone("11119");
		return student;
	}
	public static void SaveStudent(Student student){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
		System.out.println("successfully saved");
	}
	public static void GetTable(){
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("FROM Student WHERE Id=2");
	    java.util.List list = query.getResultList();
	    System.out.println(list);
		session.getTransaction().commit();
		session.close();
	}

}
