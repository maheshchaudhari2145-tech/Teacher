package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Teacher.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
