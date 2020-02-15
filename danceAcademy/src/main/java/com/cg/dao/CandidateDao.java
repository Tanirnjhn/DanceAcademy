package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.beans.Candidate;
@Repository
@Transactional
public class CandidateDao implements ICandidateDao{
	
	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public boolean signUp(Candidate candidate) {
		// TODO Auto-generated method stub
		 System.out.println("Dao");
		 entitymanager.persist(candidate);
		 return true;
	}
 
	
}
