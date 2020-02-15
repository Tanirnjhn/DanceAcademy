package com.cg.service;

import org.springframework.stereotype.Service;

import com.cg.beans.Candidate;

@Service
public interface ICandidateService {

	public boolean signUp(Candidate candidate);
}
