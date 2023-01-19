package com.praimo.vendor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.praimo.vendor.entity.VendorDetails;

@Repository
public interface VendorRepository extends JpaRepository<VendorDetails	, Long> {

}
