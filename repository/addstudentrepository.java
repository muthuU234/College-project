package com.example.varun.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.varun.model.addstudentmodel;

public interface addstudentrepository extends JpaRepository<addstudentmodel, Long> {

	boolean existsByEmail(String email);

	Optional<addstudentmodel> findByNameIgnoreCase(String name);

	Optional<addstudentmodel> findByMobileNo(String mobileNo);

}
