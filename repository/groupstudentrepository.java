package com.example.varun.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.varun.model.addstudentmodel;
import com.example.varun.model.groupstudentmodel;

public interface groupstudentrepository extends JpaRepository<groupstudentmodel, Long> {

	Optional<groupstudentmodel> findByStudent(addstudentmodel student);
}
