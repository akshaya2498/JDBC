package jdbc112;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class demo {

	public static void main(String[] args)throws SQLException {
		String sql="INSERT INTO ap VALUES(3,'LEE COOPER','JEANS')";
		String url="jdbc:mysql://localhost:3306/ap";
		String username="root";
		String password="root";
		
		Connection connection=null;
	try {
	//Load Register the driver
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	//To established the connection
	connection=DriverManager.getConnection(url,username,password);
	//To create the statement
	Statement statement=connection.createStatement();
	//To excecute the statement
	statement.execute(sql);
	System.out.println("all good");
	}catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e) {
		e.printStackTrace();
	
}
finally {
	connection.close();
	System.out.println("Akshaya");
	
}

	}

}
