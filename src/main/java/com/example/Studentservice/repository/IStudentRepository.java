package com.example.Studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Studentservice.model.Student;
@Repository
public interface IStudentRepository extends JpaRepository<Student,Long>{

	
	public Student findBysName(String sName);
}
