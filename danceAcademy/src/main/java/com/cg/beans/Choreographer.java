package com.cg.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="choreographer")
public class Choreographer {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
   @NotNull
   @Column(name = "ch_id")
	private int choreographerId;
	
	 @Column(name = "ch_name")
	 @NotNull
		private String chName;
	 
		 @Column(name = "ch_mail")
		 @NotNull
		private String chEmail;
		 
		 @Column(name = "ch_pass")
		 @NotNull
		private String chPass;
		 
		 @Column(name = "ch_mobNo")
		 @NotNull
		 private int mobNo;
		

	public Choreographer() {
		// TODO Auto-generated constructor stub
	}


	public int getChoreographerId() {
		return choreographerId;
	}


	public void setChoreographerId(int choreographerId) {
		this.choreographerId = choreographerId;
	}


	public String getChName() {
		return chName;
	}


	public void setChName(String chName) {
		this.chName = chName;
	}


	public String getChEmail() {
		return chEmail;
	}


	public void setChEmail(String chEmail) {
		this.chEmail = chEmail;
	}


	public String getChPass() {
		return chPass;
	}


	public void setChPass(String chPass) {
		this.chPass = chPass;
	}


	public int getMobNo() {
		return mobNo;
	}


	public void setMobNo(int mobNo) {
		this.mobNo = mobNo;
	}

}
