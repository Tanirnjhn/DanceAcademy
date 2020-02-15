package com.cg.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.beans.Admin;
import com.cg.service.AdminService;

@RestController
@RequestMapping("/api/dance")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	
}
