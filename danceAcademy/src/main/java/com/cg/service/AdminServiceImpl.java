package com.cg.service;

import java.util.List;

import com.cg.beans.Admin;

public interface AdminServiceImpl {

	
	Admin saveAdmin(Admin admin);

	List<Admin> getAllAdmin();

	Admin getAdminById(int adminId);

	void deleteAdmin(int adminId);

}
