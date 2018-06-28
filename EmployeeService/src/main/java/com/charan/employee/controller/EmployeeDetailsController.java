package com.charan.employee.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charan.employee.models.Employee;
import com.charan.employee.referencedata.ReferenceDataManager;

@RestController
public class EmployeeDetailsController {
	
	@Value("${server.port}")
	String serverPort;
	
	private static Logger loggger = Logger.getLogger(EmployeeDetailsController.class);
	
	@Autowired
	ReferenceDataManager referenceDataManager;
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees(){
		loggger.debug("Request hit at port: " + serverPort);
		return referenceDataManager.getEmployeeList(serverPort);
	}
	
}
