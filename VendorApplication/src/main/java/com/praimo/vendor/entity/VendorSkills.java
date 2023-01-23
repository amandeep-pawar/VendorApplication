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

	public VendorSkills() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VendorSkills(Long vsPid, String userId, String skillType, String skillDescription, Date createDate,
			Date modiDate) {
		super();
		this.vsPid = vsPid;
		this.userId = userId;
		this.skillType = skillType;
		this.skillDescription = skillDescription;
		this.createDate = createDate;
		this.modiDate = modiDate;
	}

	public Long getVsPid() {
		return vsPid;
	}

	public void setVsPid(Long vsPid) {
		this.vsPid = vsPid;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSkillType() {
		return skillType;
	}

	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}

	public String getSkillDescription() {
		return skillDescription;
	}

	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
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
		return "VendorSkills [vsPid=" + vsPid + ", userId=" + userId + ", skillType=" + skillType
				+ ", skillDescription=" + skillDescription + ", createDate=" + createDate + ", modiDate=" + modiDate
				+ "]";
	}
	
	

}
