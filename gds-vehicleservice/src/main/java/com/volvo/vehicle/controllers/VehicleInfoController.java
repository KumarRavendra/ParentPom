package com.volvo.vehicle.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.volvo.vehicle.services.VehicleInqService;



@RestController
public class VehicleInfoController {
	
	
	@Autowired
	private VehicleInqService vhclInqServ;
	
	@GetMapping("/vehicles")
	public ResponseEntity<String> getVehicles(){
		
		return new ResponseEntity<String>(vhclInqServ.getVehicles(), HttpStatus.OK);
	}


}
