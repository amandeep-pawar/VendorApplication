package com.praimo.vendor.controller;





import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import net.bytebuddy.utility.JavaConstant.MethodType;

@RestController
@Validated
public class VendorController {
	
	
	
	//@GetMapping(value = "/vendor/{look}", produces = "Application/json")
	@RequestMapping(value =  "/vendor/{look}", method = RequestMethod.GET , produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<String> vendorData(@PathVariable("look") String name) {
		return  new ResponseEntity<>(HttpStatus.OK).ok("Vendor is Coming."+ name);
				
	}

}
