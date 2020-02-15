package com.cg.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
   @NotNull
   @Column(name = "admin_id")
	private int AdminId;
	
	 @Column(name = "admin_name")
	 @NotNull
	private String adminName;
	 
	 @Column(name = "admin_mail")
	 @NotNull
	private String adminEmail;
	 
	 @Column(name = "admin_pass")
	 @NotNull
	private String adminPass;
	

	public Admin() {
		// TODO Auto-generated constructor stub
	}
	public int getAdminId() {
		return AdminId;
	}
	public void setAdminId(int adminId) {
		AdminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPass() {
		return adminPass;
	}
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}

}
