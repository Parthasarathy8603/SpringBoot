package com.lms.student.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.student.model.Student;

import com.lms.student.service.StudentService;
import com.lms.student.service.StudentServiceImplementation;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentservice;

 
    @PostMapping("/add")
    public String add(@RequestBody Student student) {
    	
//    	int frontendRegid = 121;  // Assuming the frontend sends Regid in the JSON payload
//
//        // Perform any additional processing or validation on the frontendRegid if needed
//
//        // Set the Regid for the student
//        student.setRegid(frontendRegid);
//        ssi.insertStudentData(student);
        studentservice.saveStudent(student);
    	return "New student is added";
    }	
    
    
    @GetMapping("/getAll")
    public List<Student> getAllstudents()
    {
    	return studentservice.getallstudents();
    }
    

}
