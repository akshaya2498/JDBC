package product;
import java.sql.*;
public class any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String url="jdbc:mysql://localhost:3306/ap";
		String username="root";
		String password="root";
		String sql="SELECT * FROM ap";
		
		
		try {
			
			Connection connection=DriverManager.getConnection(url,username,password);
			 Statement statement=connection.createStatement();
			 ResultSet resultset=statement.executeQuery(sql);
			 
			 while(resultset.next()) {
				 System.out.println("==========");
				 System.out.println(resultset.getInt(1));
				 System.out.println(resultset.getString(2));
				 System.out.println(resultset.getString(3));
				 System.out.println("==========");
				 
			 }
			 connection.close();
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
