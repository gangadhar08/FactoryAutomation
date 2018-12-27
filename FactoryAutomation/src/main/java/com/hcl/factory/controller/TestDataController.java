package com.hcl.factory.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.factory.model.Error;
import com.hcl.factory.model.RequestWrapper;
import com.hcl.factory.model.ResponseWrapper;
import com.hcl.factory.service.TestDataService;
import com.hcl.factory.util.RestOutput;

@RestController
public class TestDataController {
	
	
	@Autowired
	public TestDataService service;
	
	@POST	
	@RequestMapping("/getData")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public RestOutput<ResponseWrapper> getTestData(RequestWrapper requestBody) {
		RestOutput<ResponseWrapper> response = new RestOutput<>();
		try {
			ResponseWrapper resData  = service.getTestData(requestBody);			
			response.setStatus(true);
			response.setData(resData);		
		}catch (Exception ex) {
			response.addError(new Error(500,"Exception Raised Please check API::"));
		}
		
		return response;		
	}
	
	
	
	
	
	

	public static void main(String[] args) {

	}

}
