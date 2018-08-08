package com.lms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@GetMapping("/viewAll")
	public List<Employee> retrieveAllEmployee() {
		return employeeRepository.findAll();

	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Map<String,String> add(@RequestBody Employee employee) {
		Map<String,String> map=new HashMap<>();
		Employee employee1 = employeeRepository.findByUserName(employee.getUserName());

		if (employee1 != null) {
			map.put("message","User already registered") ;
			map.put("status",HttpStatus.CONFLICT.toString());
		} else {
			
			employeeService.registerEmployee(employee);

			map.put("message","Employee successfully entered") ;
			map.put("status",HttpStatus.CREATED.toString());
			
		}
		return map;
}}

