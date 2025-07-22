package jdbcex;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStatementEx {
	
	Connection connection;
	CallableStatement cStatement;
	
	public CallableStatementEx() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("connection get open");
	}
	
	public void callingProcedure(int id,String userName) throws SQLException
	{
		cStatement = connection.prepareCall("{call insertRecord(?,?)}");
		cStatement.setInt(1,id);
		cStatement.setString(2, userName);
		cStatement.execute();
		System.out.println("inserted successfully");		
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		CallableStatementEx c1 = new CallableStatementEx();
		c1.callingProcedure(101, "Nupur");
	}

}
