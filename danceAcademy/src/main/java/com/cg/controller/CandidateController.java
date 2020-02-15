package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Candidate;
import com.cg.service.ICandidateService;

@RestController
public class CandidateController {

	@Autowired
	ICandidateService iCandidateService;
	
	
	
	public ICandidateService getiCandidateService() {
		return iCandidateService;
	}



	public void setiCandidateService(ICandidateService iCandidateService) {
		this.iCandidateService = iCandidateService;
	}



	@RequestMapping(method = RequestMethod.POST, value = "/signup",consumes="application/json")
	public boolean signUp(@RequestBody Candidate candidate) {
		System.out.println("Controller");
		return iCandidateService.signUp(candidate);
	}
	
	
}
