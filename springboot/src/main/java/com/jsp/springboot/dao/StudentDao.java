package com.jsp.springboot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springboot.dto.Student;
import com.jsp.springboot.repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository studentRepository;
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	public Student getStudentById(int id) {
		Optional<Student> opt= studentRepository.findById(id);
		if(opt.isEmpty()) {
			return null;
		}else {
			return opt.get();
		}
		
	}
	public boolean deleteStudentById(int id) {
		Optional<Student> opt= studentRepository.findById(id);
		if(opt.isPresent()) {
			studentRepository.delete(opt.get());
			return true;
		}else {
			return false;
		}
	}
	public Student updateStudentById(int id, Student student) {
		Optional<Student> opt= studentRepository.findById(id);
		if(opt.isPresent()) {
		return	studentRepository.save(student);
		}else {
			return null;
		}
	}
}
