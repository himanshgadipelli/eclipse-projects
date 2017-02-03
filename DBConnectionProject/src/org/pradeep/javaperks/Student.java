package org.pradeep.javaperks;
public class Student {
	
	int id;
	String name;
	CourseDetails courseDetails;
	float gpa;
	
	public Student(int id, String name, CourseDetails courseDetails, float gpa){
		this.id=id;
		this.name=name;
		this.courseDetails = courseDetails;
		this.gpa = gpa;
			
		
	}

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

	public CourseDetails getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(CourseDetails courseDetails) {
		this.courseDetails = courseDetails;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	

	

}
