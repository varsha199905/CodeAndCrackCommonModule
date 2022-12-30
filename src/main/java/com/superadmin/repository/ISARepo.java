package com.superadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superadmin.model.SuperAdminDetails;

public interface ISARepo extends JpaRepository<SuperAdminDetails, Integer>{

	SuperAdminDetails findByEmailAndPassword(String email, String password);

	SuperAdminDetails findByEmail(String email);

}
