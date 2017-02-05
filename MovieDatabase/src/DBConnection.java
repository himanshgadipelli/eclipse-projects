import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	public static void main(String[] args){
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception Try Catch");
		}
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "qwerty");
			PreparedStatement prepareStatement = connection.prepareStatement("SELECT * FROM Bobby.MOVIE_LIST WHERE MOVIE_ID = ?");
			
			prepareStatement.setInt(1, 7);

			
			if(prepareStatement.execute()){
				ResultSet resultSet = prepareStatement.getResultSet();
				
				while (resultSet.next()){
					
				String movieName = resultSet.getString("MOVIE_NAME");
				System.out.println(movieName);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
;
	}

}
