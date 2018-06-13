package com.charan.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.charan.employee.models.Employee;
import com.charan.employee.referencedata.ReferenceDataManager;

@RestController
public class EmployeeDetailsController {
	
	@Autowired
	ReferenceDataManager referenceDataManager;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return referenceDataManager.getEmployeeList();
	}
	
}
