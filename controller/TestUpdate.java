package com.school.controller;

//import com.school.dto.Student;
import com.school.service.StudentService;

public class TestUpdate {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();

		boolean s = studentService.updateStudent(2);
		System.out.println(s);

	}

}
