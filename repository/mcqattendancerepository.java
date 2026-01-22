package com.example.varun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.varun.model.addstudentmodel;
import com.example.varun.model.mcqattendmodel;

public interface mcqattendancerepository extends JpaRepository<mcqattendmodel, Long> {

	long countByStudent(addstudentmodel student);
}
