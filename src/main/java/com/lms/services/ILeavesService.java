package com.lms.services;

import com.lms.model.Employee;

public interface ILeavesService {
	Employee findByUserName(String userName);

}
