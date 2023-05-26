package com.jsp.controller;

import java.util.ArrayList;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class TestMultipleStudentBatch {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		
		StudentDao studentDao=new StudentDao();
		
		Student s=new Student();
		s.setId(1);
		s.setName("Amruta");
		s.setEmail("Amu@gmail.com");
		
		Student s1=new Student();
		s1.setId(6);
		s1.setName("Ketki");
		s1.setEmail("ketki@gmail.com");
		
		Student s2=new Student();
		s2.setId(5);
		s2.setName("Rani");
		s2.setEmail("Rani@gmail.com");
		
		Student s3=new Student();
		s3.setId(7);
		s3.setName("Madhuri");
		s3.setEmail("Madhuri@gmail.com");
		
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		studentDao.addMultipleStudent(al);
		
		
		
			
	}
}
