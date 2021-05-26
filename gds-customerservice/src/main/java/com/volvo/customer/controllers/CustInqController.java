package com.volvo.customer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.volvo.customer.services.CustInqService;

@RestController
public class CustInqController {
	
	@Autowired
	private CustInqService custInqServ;
	
	@GetMapping("/customers")
	public ResponseEntity<String> getCustomers(){
		
		return new ResponseEntity<String>(custInqServ.getCustomers(), HttpStatus.OK);
	}

}
