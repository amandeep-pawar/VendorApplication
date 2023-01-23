package com.praimo.vendor.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.praimo.vendor.entity.CND;

@Repository
public interface CNDRepository extends JpaRepository<CND, Long>{
	
	List<CND> findByGroups(String group);
	
	List<CND> findByCndPidIn(List<Long> list);
	

}
