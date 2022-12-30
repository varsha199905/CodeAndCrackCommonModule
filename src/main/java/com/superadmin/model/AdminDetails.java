package com.superadmin.model;

import java.sql.Timestamp;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;



@Entity

@Table(name = "admin_details")
@Data
public class AdminDetails {
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "admin_id", nullable = false)
		// @Column(name="user_id")
		private Integer id;

//		@Column(name = "address")
//		private String address;

//		@Column(name = "contact_no")
//		private long contactNo;

		@Column(name = "org_email_id")
		private String email;

		@Column(name = "first_name")
		private String firstName;

		@Column(name = "last_name")
		private String lastName;

		@Column(name = "password")
		private String password;
		
		@Column(name = "org_name")
		private String orgName;

		@Column(name = "security_ques_1")
		private String securityQues1;

		@Column(name = "security_ques_2")
		private String securityQues2;

		@Column(name = "security_ques_3")
		private String securityQues3;

		@Column(name = "security_ans_1")
		private String securityAns1;

		@Column(name = "security_ans_2")
		private String securityAns2;

		@Column(name = "security_ans_3")
		private String securityAns3;
	    
		
		@Column(name = "created_ts")
		private Timestamp createdDate = Timestamp.from(Instant.now());

		@Column(name = "updated_ts")
		private Timestamp updatedDate = Timestamp.from(Instant.now());
		
		@Column(name = "is_approved")
		private Character is_approved = 'N';

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getOrgName() {
			return orgName;
		}

		public void setOrgName(String orgName) {
			this.orgName = orgName;
		}

		public String getSecurityQues1() {
			return securityQues1;
		}

		public void setSecurityQues1(String securityQues1) {
			this.securityQues1 = securityQues1;
		}

		public String getSecurityQues2() {
			return securityQues2;
		}

		public void setSecurityQues2(String securityQues2) {
			this.securityQues2 = securityQues2;
		}

		public String getSecurityQues3() {
			return securityQues3;
		}

		public void setSecurityQues3(String securityQues3) {
			this.securityQues3 = securityQues3;
		}

		public String getSecurityAns1() {
			return securityAns1;
		}

		public void setSecurityAns1(String securityAns1) {
			this.securityAns1 = securityAns1;
		}

		public String getSecurityAns2() {
			return securityAns2;
		}

		public void setSecurityAns2(String securityAns2) {
			this.securityAns2 = securityAns2;
		}

		public String getSecurityAns3() {
			return securityAns3;
		}

		public void setSecurityAns3(String securityAns3) {
			this.securityAns3 = securityAns3;
		}

		public Timestamp getCreatedDate() {
			return createdDate;
		}

		public void setCreatedDate(Timestamp createdDate) {
			this.createdDate = createdDate;
		}

		public Timestamp getUpdatedDate() {
			return updatedDate;
		}

		public void setUpdatedDate(Timestamp updatedDate) {
			this.updatedDate = updatedDate;
		}

		public Character getIs_approved() {
			return is_approved;
		}

		public void setIs_approved(Character is_approved) {
			this.is_approved = is_approved;
		}

		@Override
		public String toString() {
			return "AdminDetails [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", password=" + password + ", orgName=" + orgName + ", securityQues1=" + securityQues1
					+ ", securityQues2=" + securityQues2 + ", securityQues3=" + securityQues3 + ", securityAns1="
					+ securityAns1 + ", securityAns2=" + securityAns2 + ", securityAns3=" + securityAns3
					+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + ", is_approved=" + is_approved
					+ "]";
		}
		
		
		


}
