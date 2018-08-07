package com.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.model.Employee;
import com.lms.repositories.EmployeeRepository;
import com.lms.services.IEmployeeService;
@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private IEmployeeService employeeService;

	@Autowired
	private EmployeeRepository employeeRepository;

	
	@PostMapping("/add")
	public String add(@RequestBody Employee employee) {
		
		Employee employee1 = employeeRepository.findByUserName(employee.getUserName());

		if (employee1 != null) {
			return "User already registered";

		} else {
			
			employeeService.registerEmployee(employee);
			return "Employee successfully entered";
		}
}}

