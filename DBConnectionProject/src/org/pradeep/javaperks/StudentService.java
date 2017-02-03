package org.pradeep.javaperks;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentService implements DbSqlUtil {
	public boolean storeStudentInfo(Student student) {

		ConnectionManagement management = new ConnectionManagement();
		Connection connection = management.getConnection();
//		connection.setAutoCommit(false);

		try {
			PreparedStatement prepareStatement = connection.prepareStatement("INSERT_STUDENT_SQL");

			prepareStatement.setInt(1, student.getId());
			prepareStatement.setString(2, student.getName());
			prepareStatement.setInt(3, student.getCourseDetails() != null ? student.getCourseDetails().getId() : null);
			prepareStatement.setFloat(4, student.getGpa());
			prepareStatement.execute();
			
			CourseDetails courseDetails = student.getCourseDetails();
			PreparedStatement courseStatement2 = connection.prepareStatement("QUERY FOR COURSE");
			courseStatement2.execute();
			
			ProfessorDetails professorDetails = courseDetails.getProfessorDetails();

			PreparedStatement courseStatement3 = connection.prepareStatement("QUERY FOR PROFESSOR");
			courseStatement3.execute();
			
			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}

}
