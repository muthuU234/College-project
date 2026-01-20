package com.example.varun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.varun.model.addstudentmodel;

public interface addstudentrepository extends JpaRepository<addstudentmodel, Long> {

	boolean existsByEmail(String email);

}
