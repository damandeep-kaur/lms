package com.lms.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.model.Employee;
import com.lms.repositories.EmployeeRepository;
import com.lms.services.ILeavesService;

@Service
@Transactional
public class LeavesServiceImpl implements ILeavesService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee findByUserName(String userName) {

		return employeeRepository.findByUserName(userName);

	}

}
