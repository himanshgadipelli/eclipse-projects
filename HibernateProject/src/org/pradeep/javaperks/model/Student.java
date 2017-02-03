package org.pradeep.javaperks.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student {
	@Column(name = "STUDENT_NAME")
	String studentName;
	
	@Id @GeneratedValue
	@Column(name = "STUDENT_NBR")
	int studentNbr;
	
	@Embedded
	CourseDetail details;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentNbr() {
		return studentNbr;
	}
	public void setStudentNbr(int studentNbr) {
		this.studentNbr = studentNbr;
	}
	public CourseDetail getDetails() {
		return details;
	}
	public void setDetails(CourseDetail details) {
		this.details = details;
	}
	
	

}
