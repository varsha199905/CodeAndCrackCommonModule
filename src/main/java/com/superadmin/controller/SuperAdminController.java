package com.superadmin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superadmin.model.AdminDetails;
import com.superadmin.model.UserDetails;
import com.superadmin.service.ISuperAdminService;

@RestController
public class SuperAdminController {
	
	@Autowired
	ISuperAdminService iSuperAdminService;
	
	@GetMapping("/getdata")
	public List<UserDetails> getpage() {
		
	List<UserDetails> listofuser = iSuperAdminService.getData();
	
		return listofuser;
		
	}
	
	@GetMapping("/adminDetails")
	public List<AdminDetails> getAdminDetails(){
		
		return iSuperAdminService.getAdminDetails();
		
		
		
		
	}
	
	

}
