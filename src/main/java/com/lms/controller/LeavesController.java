package com.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.model.Employee;
import com.lms.repositories.EmployeeRepository;
import com.lms.services.IEmployeeService;

@RestController
@RequestMapping("/api4")
public class LeavesController {
	@Autowired
	private IEmployeeService employeeService;

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/viewAll")
	public List<Employee> retrieveAllEmployee() {
		return employeeRepository.findAll();

	}

}
