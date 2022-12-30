package com.superadmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superadmin.model.AdminDetails;
import com.superadmin.model.UserDetails;
import com.superadmin.repository.ISAAdminRepo;
import com.superadmin.repository.ISuperUserRepo;

@Service
public class SuperAdminServiceImpl implements ISuperAdminService {
	
	
	@Autowired
	ISuperUserRepo iSuperAdminRepo;
	
	@Autowired
	ISAAdminRepo iSAAdminRepo;

	@Override
	public List<UserDetails> getData() {
		
		return iSuperAdminRepo.findAll();
	}

	@Override
	public List<AdminDetails> getAdminDetails() {
		
		return iSAAdminRepo.findAll();
	}
	

}
