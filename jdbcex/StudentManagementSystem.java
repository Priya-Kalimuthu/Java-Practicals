package jdbcex;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class StudentManagementSystem {
	
	Connection con;
	PreparedStatement preparedStatement;
	
	CallableStatement callableStatement;
	ResultSet rs;
	
	public StudentManagementSystem() throws ClassNotFoundException, SQLException {
		con = MyConnection.getMyConnection();
		System.out.println("Connection get open");
	}
	
	public void insertStudent(int rollno, String sname, LocalDate dob, float percentage, String city, String email_id, String phone_no ) throws SQLException {
		callableStatement = con.prepareCall("{call student_Record(?,?,?,?,?,?,?)}");
		callableStatement.setInt(1, rollno);
		callableStatement.setString(2, sname);
		callableStatement.setObject(3, dob);
		callableStatement.setFloat(4, percentage);
		callableStatement.setString(5, city);
		callableStatement.setString(6, email_id);
		callableStatement.setString(7, phone_no);
		callableStatement.execute();
		System.out.println("Inserted Successfully");
		
	}
	
	public void displayStudent() throws SQLException {
		preparedStatement = con.prepareStatement("select * from student1");
		while(rs.next()) {
			System.out.println(rs.getInt(1) + "\t");
			System.out.println(rs.getString(2) + "\t");
			System.out.println(rs.getDate(3) + "\t");
			System.out.println(rs.getFloat(4) + "\t");
			System.out.println(rs.getString(5) + "\t");
			System.out.println(rs.getString(6) + "\t");
			System.out.println(rs.getString(7) + "\t");
		}
	}
	
	public void updateStudent(int rollno, String sname, LocalDate dob, float percentage, String city, String email_id, String phone_no) throws SQLException {
		preparedStatement = con.prepareStatement("update student1 set sname=?, dob=?, percentage=?, city=?, email_id=?, phone_no=? where rollno=? ");
	
		preparedStatement.setString(1, sname);
		preparedStatement.setObject(2, dob);
		preparedStatement.setFloat(3, percentage);
		preparedStatement.setString(4, city);
		preparedStatement.setString(5, email_id);
		preparedStatement.setString(6, phone_no);
		preparedStatement.setInt(7, rollno);
		int n = preparedStatement.executeUpdate();
		System.out.println(n+"records updated successfully");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
