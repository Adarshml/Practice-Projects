package com.example.QuizApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuizApp.entities.Participant;
import com.example.QuizApp.entities.Quiz;
import com.example.QuizApp.entities.Score;
import com.example.QuizApp.entities.Userquiz;
import com.example.QuizApp.repository.ParticipantRepository;

@Service
public class ParticipantService {

	@Autowired
	ParticipantRepository participantRepo;

	public String userRegister(Participant pt) {
		if (participantRepo.userRegister(pt) > 0) {
			return "User Registration Successful";
		} else {
			return "User Registration Failure";
		}
	}

	public String checkUser(Participant pt) {
		if (participantRepo.checkUser(pt) > 0) {
			return "Participant Login Successful";
		} else {
			return "Failure! Provide Correct Credentials!";
		}
	}

	public String takeQuiz(Userquiz uq) {
		if (participantRepo.takeQuiz(uq) > 0) {
			return "Quiz Attempted Successfully";
		} else {
			return "Try Again!";
		}
	}

	public Score getResult(String email) {
		return participantRepo.getResult(email);
	}

	public List<Quiz> getAllQuiz() {
		return participantRepo.getAllQuiz();
	}
}
