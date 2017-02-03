package org.pradeep.javaperks.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CourseDetail {
	
	@Column(name = "COURSE_NAME")
	String courseName;
	
	@Column(name = "COURSE_ID")
	int courseId;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	

}
