package com.lms.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.model.Employee;
import com.lms.repositories.EmployeeRepository;
import com.lms.services.IEmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	

	@Override
	public void registerEmployee(Employee employee) {
		employeeRepository.save(employee);


		
	}



	


	@Override
	public Employee findByUserNameAndPassword(String userName, String password) {
		return employeeRepository.findByUserNameAndPassword(userName, password);}



	@Override
	public Employee findByUserName(String userName) {

		return employeeRepository.findByUserName(userName);
		
	}}
