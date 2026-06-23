package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
 
	private StudentRepository rs;
	
	@Override
	public void add(Student s) {
		// TODO Auto-generated method stub
		rs.save(s);
		

	}

	@Override
	public List<Student> display() {
		// TODO Auto-generated method stub
		return rs.findAll();
	}

}
