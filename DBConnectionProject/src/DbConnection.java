import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

	public static void main(String[] args) {
		System.out.println("Hey");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception");
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "qwerty");
			
//			Statement createStatement = connection.createStatement();
//			
//			String str = String.format("INSERT INTO JuneBT.STUDENT VALUES(2,%s,%s,%s)","PRADEEP", "LA","123456");
//			
//			String insertQuery = "INSERT INTO JuneBT.STUDENT VALUES(3,\"Himansh\",\"LA\",\"65401\")";
//			
//			ResultSet rs = createStatement.executeQuery("SELECT NAME FROM JuneBT.STUDENT");
//			while(rs.next()){
//				
//				String studentName = rs.getString("NAME");
//				System.out.println("Inside while "+studentName);
//			}
//
//			
			PreparedStatement prepareStatement = connection.prepareStatement("SELECT * FROM JuneBT.STUDENT WHERE STUDENT_NBR = ? ");
			
			prepareStatement.setInt(1, 1);
			
			if(prepareStatement.execute()){
				ResultSet resultSet = prepareStatement.getResultSet();
				
				while (resultSet.next()){
					
				String studentName = resultSet.getString("NAME");
				System.out.println("Inside while "+ studentName);
				}
			}
			
			
			boolean execute = prepareStatement.execute();
			System.out.println("QUERY EXECUTE " + execute);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("EVERYTHING GOOD");
		
	}

}
