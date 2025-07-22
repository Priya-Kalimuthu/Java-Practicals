package jdbcex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx {
	
	Connection con;
	Statement stmt;
	ResultSet resultSet;
	
	public StatementEx() throws ClassNotFoundException, SQLException {
		con = MyConnection.getMyConnection();
		System.out.println("connection get open");
	}
	
	public void getData() throws SQLException {
		stmt = con.createStatement();
		resultSet = stmt.executeQuery("Select * from MovieCatagory");
		while(resultSet.next()) {
			System.out.println(resultSet.getInt(1) + "\t");
			System.out.println(resultSet.getString(2) + "\t");
			System.out.println();
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		StatementEx st = new StatementEx();
		st.getData();

	}

}
