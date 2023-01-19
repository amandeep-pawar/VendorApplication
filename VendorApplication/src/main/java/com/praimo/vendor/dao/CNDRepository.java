package com.praimo.vendor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.praimo.vendor.entity.CND;

@Repository
public interface CNDRepository extends JpaRepository<CND, Long>{

}
