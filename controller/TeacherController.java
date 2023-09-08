package com.school.controller;

import com.school.dto.Teacher;
import com.school.service.TeacherService;

public class TeacherController {
	
	
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		
		teacher.setId(3);
		teacher.setName("vipul");
		teacher.setEmail("vipul@gamil.com");
		
		
		TeacherService teacherService = new TeacherService();
		
		Teacher t = teacherService.saveTeacher(teacher);
		
		if(t!=null) {
			System.out.println(t.getId() + "saved Sucessfully");
		}
		}
	
	

}
