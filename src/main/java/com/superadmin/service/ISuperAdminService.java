package com.superadmin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.superadmin.model.AdminDetails;
import com.superadmin.model.UserDetails;

@Service
public interface ISuperAdminService {

	List<UserDetails> getData();

	List<AdminDetails> getAdminDetails();

}
