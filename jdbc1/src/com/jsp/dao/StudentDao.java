package com.jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jsp.dto.Student;
import com.jsp.util.HelperClass;

public class StudentDao {
	HelperClass helperclass=new HelperClass();
	public void saveStudent(Student student) {
		String sql="insert into student values(?,?,?,?,?)";
		Connection connection=null;
		
		try {
		  connection=helperclass.getConnection();
		}  catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
		PreparedStatement preparedstatement=connection.prepareStatement(sql);
		preparedstatement.setInt(1, student.getId());
		preparedstatement.setString(2, student.getname());
		preparedstatement.setString(3, student.getemail());
		preparedstatement.setString(4, student.getgender());
		preparedstatement.setString(5, student.getcno());
		
		preparedstatement.execute();
		System.out.println("all good");
		if(connection!=null) {
			connection.close();
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
		
		
	
	
