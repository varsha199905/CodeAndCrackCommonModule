package com.superadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superadmin.model.UserDetails;

public interface ISuperUserRepo extends JpaRepository<UserDetails, Integer> {
	

}
