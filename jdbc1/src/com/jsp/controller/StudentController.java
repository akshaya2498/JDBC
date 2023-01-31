package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student=new Student();
		student.setId(1);
		student.setname("adam");
		student.setemail( "adam@gamil.com");
		student.setgender( "male");
		student.setcno("45678923");
		StudentDao studentdao=new StudentDao();
		studentdao.saveStudent(student);
		
	}
	}



