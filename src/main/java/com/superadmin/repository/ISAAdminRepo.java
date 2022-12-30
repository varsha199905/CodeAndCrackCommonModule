package com.superadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superadmin.model.AdminDetails;

public interface ISAAdminRepo extends JpaRepository<AdminDetails, Integer>{

}
