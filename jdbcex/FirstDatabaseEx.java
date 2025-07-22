package jdbcex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstDatabaseEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		// register driver
		// Class.forName("com.mysql.cj.jdbc.Driver");
		
		// establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aftrbatch", "root", "Sathyapriya");
		
		// create statement
		Statement statement = con.createStatement();
		
		// execute statement
		ResultSet rSet = statement.executeQuery("Select * from MovieCatagory");
		
		// retrieve the result
		while(rSet.next()) {
			System.out.println(rSet.getInt("catagory_id") + "\t");
			System.out.println(rSet.getString("catagory_name") + "\t");
			System.out.println();
			
			
			
		}
		// close the connection
		statement.close();
		con.close();


	}

}
