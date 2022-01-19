import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCFirst {
	
	public static void main(String[] args) {
		
	try {
			
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver Loaded");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "1234");
	System.out.println("Connection Established");
	
	
	
	} catch (ClassNotFoundException | SQLException e) {
	
		e.printStackTrace();
		
	}
		

	}

}
