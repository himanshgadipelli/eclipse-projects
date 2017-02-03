package org.pradeep.javaperks;

public class CourseDetails {

	int id;
	String name;
	int length;
	ProfessorDetails professorDetails;

	public CourseDetails(int id, String name, int length, ProfessorDetails professorDetails) {
		this.id = id;
		this.name = name;
		this.length = length;
		this.professorDetails = professorDetails;

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

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public ProfessorDetails getProfessorDetails() {
		return professorDetails;
	}

	public void setProfessorDetails(ProfessorDetails professorDetails) {
		this.professorDetails = professorDetails;
	}

}
