package com.lms.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lms.student.model.Student;
import com.lms.student.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {

	private final StudentRepository studentRepository;

    public StudentServiceImplementation(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
	public List<Student> getallstudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
	
	

}
