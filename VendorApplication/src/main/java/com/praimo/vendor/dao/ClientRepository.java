package com.praimo.vendor.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.praimo.vendor.entity.ClientDetails;

@Repository
public interface ClientRepository extends JpaRepository<ClientDetails, Long> {

}
