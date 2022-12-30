package com.superadmin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superadmin.model.SuperAdminDetails;
import com.superadmin.repository.ISARepo;

@Service

public class SAserviceimpl implements ISAservice {
	
	@Autowired
	ISARepo iSARepo;

	@Override
	public SuperAdminDetails saveUserData(SuperAdminDetails superAdminDetails) {
		
		return iSARepo.save(superAdminDetails);
	}

	@Override
	public SuperAdminDetails findByEmailIdAndPassword(String email, String password) {
		
		return iSARepo.findByEmailAndPassword(email, password);
	}

	@Override
	public SuperAdminDetails findByEmailId(String email) {
		return iSARepo.findByEmail(email);
	}

	@Override
	public SuperAdminDetails updateData(SuperAdminDetails userDetails) {
		
		return iSARepo.save(userDetails);
		
	}
	
	

}
