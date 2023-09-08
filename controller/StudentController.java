package com.school.controller;

import java.util.Scanner;

import com.school.dto.Student;
import com.school.service.StudentService;

public class StudentController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Id:- ");
		int id = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter name:- ");
		String name = sc1.nextLine();

		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter email:- ");
		String email = sc2.nextLine();

		Student student = new Student();

		student.setId(id);
		student.setName(name);
		student.setEmail(email);

		StudentService studentService = new StudentService();

		Student s = studentService.saveStudent(student);

		if (s != null) {
			System.out.println(s.getId() + " saved sucessfully");
		}
	}

}
