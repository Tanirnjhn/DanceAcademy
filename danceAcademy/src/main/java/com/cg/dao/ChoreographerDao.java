package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.beans.Choreographer;

public interface ChoreographerDao extends JpaRepository<Choreographer, Integer>{

}
