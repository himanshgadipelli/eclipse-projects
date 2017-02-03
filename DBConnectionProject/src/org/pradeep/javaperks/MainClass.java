package org.pradeep.javaperks;

public class MainClass {

	public static void main(String[] args) {
		
		// Pull from sequences.

		ProfessorDetails professorDetails = new ProfessorDetails(1, "Pradeep");

		CourseDetails courseDetails = new CourseDetails(1, "Java", 3, professorDetails);

		Student student = new Student(1, "NaNi", courseDetails, 3.9f);
		
		StudentService service = new StudentService();
		
		boolean studentCreated = service.storeStudentInfo(student);
		if(studentCreated){
			//Logger student created successful
		}else{
			//Logger student created failed
		}

	}

}
