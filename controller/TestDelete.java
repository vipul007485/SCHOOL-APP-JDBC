package com.school.controller;

import java.util.Scanner;

import com.school.service.StudentService;

public class TestDelete {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id:- ");
		int id = sc.nextInt();
		StudentService studentService = new StudentService();

		boolean b = studentService.deleteStudent(id);

		System.out.println(b);

	}

}
