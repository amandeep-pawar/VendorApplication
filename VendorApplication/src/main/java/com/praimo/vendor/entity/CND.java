package com.praimo.vendor.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CND {

	// pending for foreign key and primary key and data members name
	@Id
	private Long cndPid;

	private String groups;

	private String description;

	private Date createDate;

	private Date modiDate;

}
