package com.praimo.vendor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.praimo.vendor.entity.UserDetails;


@Repository
public interface UserRepository  extends JpaRepository<UserDetails	, Long>{

}
