package com.lms.services;

import com.lms.model.Employee;

public interface IEmployeeService {

	void registerEmployee(Employee employee);

	Employee findByUserNameAndPassword(String userName, String password);

	Employee findByUserName(String userName);
}
