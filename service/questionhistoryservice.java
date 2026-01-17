package com.example.varun.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.varun.model.questionhistorymodel;
import com.example.varun.repository.questionhistoryrepository;

@Service
public class questionhistoryservice {

	private questionhistoryrepository questionRepository = null;

	public void questionihstoryservice(questionhistoryrepository questionRepository) {
		this.questionRepository = questionRepository;
	}

	public List<questionhistorymodel> getQuestionHistory() {
		return questionRepository.findAllByOrderByPostedAtDesc();
	}
}
