package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.beans.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Integer> {


}