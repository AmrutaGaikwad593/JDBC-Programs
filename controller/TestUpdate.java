package com.jsp.controller;

import com.jsp.dao.StudentDao;

public class TestUpdate {
	public static void main(String[] args) {
		StudentDao studentDao=new StudentDao();
		String email="sdr@gmail.com";
		boolean a=studentDao.updateStudentById(1, email);
		System.out.println(a);
		
		
		
}
}
