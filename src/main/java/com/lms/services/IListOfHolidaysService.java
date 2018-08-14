package com.lms.services;

import com.lms.model.Employee;
import com.lms.model.ListOfHolidays;

public interface IListOfHolidaysService {
	ListOfHolidays findByType(String type);
	ListOfHolidays registerHoliday(ListOfHolidays holiday);

}
