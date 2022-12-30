package com.superadmin.service;

import org.springframework.stereotype.Service;

import com.superadmin.model.SuperAdminDetails;

@Service

public interface ISAservice {

	SuperAdminDetails saveUserData(SuperAdminDetails superAdminDetails);

	SuperAdminDetails findByEmailIdAndPassword(String string, String string2);

	SuperAdminDetails findByEmailId(String email);

	SuperAdminDetails updateData(SuperAdminDetails userDetails);
	
	

}
