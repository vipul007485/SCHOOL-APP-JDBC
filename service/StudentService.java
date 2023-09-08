package com.school.service;

import com.school.dao.StudentDao;
import com.school.dto.Student;

public class StudentService {
	
	
	StudentDao studentDao = new StudentDao();
	
	public boolean updateStudent(int id) {
		boolean s = studentDao.updateStudent(id);
			return s;
		
	}
	
	public boolean deleteStudent(int id) {
		boolean d = studentDao.deleteStudent(id);
		return d;
	}
	
	public Student saveStudent(Student student) {
		
		Student s =  studentDao.saveStudent(student);
		return s;
	}
	
public int getStudent(int id) {
		
		int s =  studentDao.getStudent(id);
		return s;
		
	}
public void getAllStudent() {
	studentDao.GetAllStudent();
}


}
