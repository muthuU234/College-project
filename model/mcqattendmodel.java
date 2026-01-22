package com.example.varun.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "mcq_attendance", uniqueConstraints = @UniqueConstraint(columnNames = { "student_id", "question_id" }))
public class mcqattendmodel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(optional = false)
	@JoinColumn(name = "student_id")
	private addstudentmodel student;

	@ManyToOne(optional = false)
	@JoinColumn(name = "question_id")
	private mcqquestionmodel question;

	// attended = true means student attempted the question
	private boolean attended = true;

	public Long getId() {
		return id;
	}

	public addstudentmodel getStudent() {
		return student;
	}

	public void setStudent(addstudentmodel student) {
		this.student = student;
	}

	public mcqquestionmodel getQuestion() {
		return question;
	}

	public void setQuestion(mcqquestionmodel question) {
		this.question = question;
	}

	public boolean isAttended() {
		return attended;
	}

	public void setAttended(boolean attended) {
		this.attended = attended;
	}
}
