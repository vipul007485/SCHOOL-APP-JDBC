package com.school.service;



import com.school.dao.TeacherDao;
import com.school.dto.Teacher;

public class TeacherService {
	
	
	TeacherDao teacherDao = new TeacherDao();
	
	
	
	
	public Teacher saveTeacher(Teacher teacher) {
		
		Teacher t = teacherDao.saveTeacher(teacher);
		return t;
	}
	
	

}
