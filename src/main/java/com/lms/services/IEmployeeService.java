package com.lms.services;

import com.lms.model.Employee;

public interface IEmployeeService {

	Employee registerEmployee(Employee employee);

	Employee findByUserNameAndPassword(String userName, String password);

	Employee findByUserName(String userName);
}
