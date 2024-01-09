package com.lms.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lms.student.model.Student;


public interface StudentRepository extends JpaRepository<Student, Integer> {

	

	   
	
	

}
