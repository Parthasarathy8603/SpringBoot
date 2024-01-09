package com.lms.student.service;

import java.util.List;

import com.lms.student.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public List<Student> getallstudents();
	
	

}
