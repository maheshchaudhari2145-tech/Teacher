package com.example.demo.service;

import java.util.List;

import Teacher.Teacher;

public interface TeacherService {
	
	void add(Teacher t);
	List<Teacher>display();
	void delete(Integer id);
	Teacher update(Integer id, Teacher t);
	

}
