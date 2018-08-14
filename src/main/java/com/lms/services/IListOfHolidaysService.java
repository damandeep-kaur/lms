package com.lms.services;

import com.lms.model.ListOfHolidays;

public interface IListOfHolidaysService {
	ListOfHolidays findByType(String type);
}
