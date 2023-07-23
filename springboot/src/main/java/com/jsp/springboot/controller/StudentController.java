package com.jsp.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springboot.dto.Student;
import com.jsp.springboot.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	@GetMapping("/student")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable int id) {
		return studentService.getStudentById(id);
	}
	@DeleteMapping("/student/{id}")
	public boolean deleteStudentById(@PathVariable 	int id) {
		return studentService.deleteStudentById(id);
	}
	@PutMapping("/student/{id}")
	public Student updateStudentById(@PathVariable  int id,@RequestBody Student student) {
	return studentService.updateStudentById(id, student);	
	}
	}

