package com.bankingApplication.bankExpert.entity;

import java.util.Date;

import jakarta.persistence.Entity;

@Entity
public class Customer {
	
	
//	String bankId;
//	String bankName;
	String branchName;
	String custId;
	Boolean liveStatus=true;
	String irNo;
	String fName;
	String mName;
	String lName;
	
	Long  aadhar;
	String pan;
	Double acBal;
	Long  mobileNo;
	String religion;
	String cast;
	Boolean isMinority;
	
	
	

}
