package com.superadmin.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.superadmin.Vo.SuperAdminDetailsVo;
import com.superadmin.model.SuperAdminDetails;
import com.superadmin.service.ISAservice;

@RestController
public class SAController {
	
	@Autowired
	ISAservice iSAservice;
	
	
	
	//Registration 
		@PostMapping(value = "/register-sa", produces = "application/json") // REST API
		public ResponseEntity<SuperAdminDetails> userRegister(@RequestBody SuperAdminDetails superAdminDetails) {

			return new ResponseEntity<SuperAdminDetails>(iSAservice.saveUserData(superAdminDetails), HttpStatus.OK);
		}

		
		
		// login User
		@PostMapping(value = "/login-sa", produces = { "*/*" }, consumes = { "*/*" })
		//@PostMapping("/login-user")
		public ResponseEntity<?> loginUser(@RequestBody List<String> userParams) {

			HttpHeaders headers = new HttpHeaders();
			headers.add("Content-Type", "application/json");
			SuperAdminDetails superAdminDetails = iSAservice.findByEmailIdAndPassword(userParams.get(0), userParams.get(1));
			if (null != superAdminDetails && null != superAdminDetails.getEmail())
				return new ResponseEntity<>(superAdminDetails, headers, HttpStatus.OK);
			else
				return new ResponseEntity<>(superAdminDetails, headers, HttpStatus.OK);
		}

		
		// Forgot password
		@GetMapping(value = "/forgotpwd-sa", produces = MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<?> loadQuestion(@RequestParam String email) {
			SuperAdminDetails superAdminDetails = iSAservice.findByEmailId(email);
			ModelMapper mapper = new ModelMapper();
			mapper.getConfiguration().setSkipNullEnabled(true);
			SuperAdminDetailsVo userVo = new SuperAdminDetailsVo();
			if (null != superAdminDetails)
				userVo = mapper.map(superAdminDetails, SuperAdminDetailsVo.class);
			return new ResponseEntity<>(userVo, HttpStatus.OK);

		}

		
		// update password
		
		@PostMapping("/update-sa")
		public ResponseEntity<?> rstPassword(@RequestBody List<String> paramList) {
			SuperAdminDetails superAdminDetails = iSAservice.findByEmailId(paramList.get(0));
			superAdminDetails.setPassword(paramList.get(1));
			iSAservice.updateData(superAdminDetails);
			return new ResponseEntity<>(superAdminDetails, HttpStatus.OK);

		}

	
	
	
	
	
	

}
