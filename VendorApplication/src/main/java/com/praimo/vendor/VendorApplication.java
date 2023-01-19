package com.praimo.vendor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

//@ComponentScan(basePackages = "com.infy.package")
//@PropertySource("classpath:application.properties")
//@PropertySources(
//		{
//			@PropertySource("classpath:doot.properties")
//})
@SpringBootApplication
public class VendorApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(VendorApplication.class, args);

		
		
	}

}
