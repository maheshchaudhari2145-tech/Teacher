package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Teacher.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
