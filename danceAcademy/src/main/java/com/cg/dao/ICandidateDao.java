package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.beans.Candidate;

@Repository
public interface ICandidateDao {

	public boolean signUp(Candidate candidate);
}
