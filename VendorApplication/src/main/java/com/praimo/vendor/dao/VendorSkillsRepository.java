package com.praimo.vendor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.praimo.vendor.entity.VendorSkills;

@Repository
public interface VendorSkillsRepository extends JpaRepository<VendorSkills, Long>{

}
