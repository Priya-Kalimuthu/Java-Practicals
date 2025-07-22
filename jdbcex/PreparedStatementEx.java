package jdbcex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementEx {
	
	Connection con;
	PreparedStatement pstStatement;
	ResultSet rsSet;
	
	public PreparedStatementEx() throws ClassNotFoundException, SQLException {
		con = MyConnection.getMyConnection();
		System.out.println("connection get open");
	}
	
	public void getData(float minSalary, float maxSalary) throws SQLException {
		pstStatement = con.prepareStatement("select * from employeedetails where salary beyween ? and ?");
		pstStatement.setFloat(1, minSalary);
		pstStatement.setFloat(1, maxSalary);
		rsSet = pstStatement.executeQuery();	// DRL
		while(rsSet.next()) {
			System.out.println(rsSet.getInt(1) + "\t");
			System.out.println(rsSet.getString(2) + "\t");
			System.out.println(rsSet.getFloat(3) + "\t");
			System.out.println(rsSet.getDate(4) + "\t");
			System.out.println(rsSet.getString(5) + "\t");
			System.out.println();
		}
	}
	
	public void insertRecord(int cust_id, String cust_name, String cust_address, String phone_no) throws SQLException {
		pstStatement = con.prepareStatement("insert into customer values(?,?,?,?)");
		pstStatement.setInt(1, cust_id);
		pstStatement.setString(2, cust_name);
		pstStatement.setString(3, cust_address);
		pstStatement.setString(4, phone_no);
		int n = pstStatement.executeUpdate();  // DML
		System.out.println(n+" record is inserted");
	}
	
	public void updateCustomer(String phoneNo,int custID) throws SQLException
	{
		pstStatement = con.prepareStatement("update customer set phone_no = ? where cust_id = ?");
		pstStatement.setString(1, phoneNo);
		pstStatement.setInt(2, custID);
		int n = pstStatement.executeUpdate();
		System.out.println(n + " record is updated");
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		PreparedStatementEx p1 = new PreparedStatementEx();
		p1.getData(50000, 80000);
		//p1.insertRecord(107, "Rohit", "Mumbai", "9900765454");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter phone number and customer id : ");
		String phoneNo = sc.next();
		int custId = sc.nextInt();
		
		p1.updateCustomer(phoneNo, custId);
		
		
	}
}


/*
 *  update customer set phoneNo = '9876544334' where cust_id = 106; 
 *  update customer set phoneNo = ? where cust_id = ?; 
 *  delete from customer where cust_id = ?
 */

		
		

	


