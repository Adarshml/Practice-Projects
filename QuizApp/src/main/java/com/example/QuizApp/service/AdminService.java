package com.example.QuizApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.QuizApp.entities.Admin;
import com.example.QuizApp.entities.Question;
import com.example.QuizApp.entities.Quiz;
import com.example.QuizApp.entities.Score;
import com.example.QuizApp.repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	AdminRepository adminRepo;
	public String CheckAdmin(Admin ad) {
		if(adminRepo.checkAdmin(ad)>0) {
			return "Admin Login Successful";
		}
		else {
			return "Failure! Provide Correct Credentials!";
		}
	}
	
	public String updatePassword(Admin ad) {
		Admin a = adminRepo.getAdminDetails(ad.getEmail());
		if(a==null) {
			return "Admin details not present, cannot be updated";
		}
		else if(adminRepo.updatePassword(ad)>0) {
				return "Password Updated";
			}else {
				return "Password Not Updated";
			}
	}
	
	public String addQuestion(Question qn) {
		if(adminRepo.addQuestion(qn)>0) {
			return "Question Added Successfully";
		}
		else {
			return "Question didnt added";
		}
	}

	public String addQuiz(Quiz qz) {
		if(adminRepo.addQuiz(qz)>0) {
			return "Quiz Created Successfully";
		}
		else {
			return "Quiz didnt created";
		}
	}
	
	public Question findQuestionById(int qid) {
		return adminRepo.getQestionDetails(qid);
	}
	
	public List<Score> getstandingPosition(){
		return adminRepo.getstandingPosition();
	}
}
