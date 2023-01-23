package com.praimo.vendor.controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.praimo.vendor.dao.CNDRepository;
import com.praimo.vendor.dao.VendorSkillsRepository;
import com.praimo.vendor.entity.CND;
import com.praimo.vendor.entity.VendorSkills;

//import net.bytebuddy.utility.JavaConstant.MethodType;

@RestController
@Validated
public class VendorController {

	@Autowired
	CNDRepository cndRepository;

	@Autowired
	VendorSkillsRepository vendorSkillsRepository;

	// fetching all detail of group.,
	@RequestMapping(value = "/vendor/{type}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CND> vendorData(@PathVariable("type") String group) {

		CND cnd = new CND(111111l, "client", "aman", new Date(), new Date());
		CND cnd1 = new CND(111112l, "vendor", "aman", new Date(), new Date());

		cndRepository.save(cnd);
		cndRepository.save(cnd1);
		List<CND> cndData = cndRepository.findByGroups(group);

		return cndData;

		
	}
	
	@GetMapping("/vendors")
	public List<CND> listVendor(@RequestBody List<Long> list){
		
		List<CND> listvenCnds=cndRepository.findByCndPidIn(list);
		System.out.println(listvenCnds);
		
		return listvenCnds;
		
	}
	
	@GetMapping(value = "/vendorSkill/{skill}")
	public List<VendorSkills> vendorSkills(@PathVariable String skill){
		
		List<VendorSkills> vendorSkills= vendorSkillsRepository.findBySkillType(skill);
		System.out.println(vendorSkills.toString());
		
		return vendorSkills;
	}
	
	
	
	
	

}
