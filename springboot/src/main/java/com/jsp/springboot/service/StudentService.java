package com.jsp.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springboot.dao.StudentDao;
import com.jsp.springboot.dto.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	public Student saveStudent(Student student) {
		return studentDao.saveStudent(student);
	}
	public List<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}
	public Student getStudentById(int id) {
		return studentDao.getStudentById(id);
		
	}
	
	public boolean deleteStudentById(int id) {
return studentDao.deleteStudentById(id);
	}
	public Student updateStudentById(int id, Student student) {
		Student s= studentDao.getStudentById(id);
		s.setName(student.getName());
		s.setEmail(student.getEmail());
		return studentDao.updateStudentById(id, s);
	}
}

