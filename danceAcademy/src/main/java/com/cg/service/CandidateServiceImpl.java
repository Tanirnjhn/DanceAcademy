package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.Candidate;
import com.cg.dao.ICandidateDao;

@Service
public class CandidateServiceImpl implements ICandidateService {
	
	@Autowired
	ICandidateDao iCandidateDao;
	@Override
	public boolean signUp(Candidate candidate) {
		// TODO Auto-generated method stub
		System.out.println("Service");
		return iCandidateDao.signUp(candidate);
	}

}
