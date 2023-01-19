package com.praimo.vendor.entity;

import java.util.Date;

//import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClientDetails {
	
	@Id
	private Long clPid;

	private Date createDate;

	private Date modiDate;

}
