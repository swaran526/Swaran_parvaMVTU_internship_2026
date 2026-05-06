package com.Student_Management.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Student_Management.demo.entity.Student;

@Repository
public interface StudentRepositry extends JpaRepository<Student, Integer> {

	List<Student> findAll();

	
}