package com.praimo.vendor.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class VendorDetails {

	// Pojo class.

//	@GeneratedValue(strategy= GenerationType.AUTO)
	
	
	@Id
	private Long vPid;
	
	private String vendorSkills;

	private String experience;
	
	private String vendorType;

	private String description;

	private String vendorLinks;

	private String vendorLocation;

//	private VendorDetails vendorID;
	
	private Date createDate;
	
	private Date modiDate;
	
	

}
