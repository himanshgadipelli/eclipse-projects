package org.pradeep.javaperks.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.pradeep.javaperks.model.CourseDetail;
import org.pradeep.javaperks.model.Student;

public class MainClass {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setStudentNbr(1);
		student.setStudentName("qwerty1");
		CourseDetail details = new CourseDetail();
		details.setCourseId(1);
		details.setCourseName("Java");
		student.setDetails(details);
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();
		

	}

}
