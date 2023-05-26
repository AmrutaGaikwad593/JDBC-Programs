package com.jsp.controller;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class TestJava {

	public static void main(String[] args) {
		Student student=new Student();
		student.setId(3);
		student.setName("amruta");
		student.setEmail("amruta123@gmail.com");
		
		StudentDao studentDao=new StudentDao();
		Student s=studentDao.saveStudent(student);
		System.out.println(s.getName()+ " saved successfully");
	}
}
