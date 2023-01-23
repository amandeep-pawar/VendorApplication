package com.praimo.vendor.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;

@Entity
public class CND {

	// pending for foreign key and primary key and data members name
	@Id
	private Long cndPid;

	private String groups;  // VENDOR/CLIENT

	private String description;

	private Date createDate;

	private Date modiDate;
	
	

	public CND() {
		super();
	}



	public CND(Long cndPid, String groups, String description, Date createDate, Date modiDate) {
		super();
		this.cndPid = cndPid;
		this.groups = groups;
		this.description = description;
		this.createDate = createDate;
		this.modiDate = modiDate;
	}



	public Long getCndPid() {
		return cndPid;
	}



	public void setCndPid(Long cndPid) {
		this.cndPid = cndPid;
	}



	public String getGroups() {
		return groups;
	}



	public void setGroups(String groups) {
		this.groups = groups;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Date getCreateDate() {
		return createDate;
	}



	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}



	public Date getModiDate() {
		return modiDate;
	}



	public void setModiDate(Date modiDate) {
		this.modiDate = modiDate;
	}



	@Override
	public String toString() {
		return "CND [cndPid=" + cndPid + ", groups=" + groups + ", description=" + description + ", createDate="
				+ createDate + ", modiDate=" + modiDate + "]";
	}
	
	
		
}
