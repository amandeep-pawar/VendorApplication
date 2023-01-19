package com.praimo.vendor.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VendorSkills {

	// pending for foreign key and primary key and data members name
	@Id
	private Long vsPid;

	private String userId;

	private String skillType;

	private String skillDescription;

	private Date createDate;

	private Date modiDate;

}
