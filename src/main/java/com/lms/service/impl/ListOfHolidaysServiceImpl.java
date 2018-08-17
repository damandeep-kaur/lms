package com.lms.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.model.Employee;
import com.lms.model.ListOfHolidays;
import com.lms.repositories.EmployeeRepository;
import com.lms.repositories.HolidayRepository;
import com.lms.services.IListOfHolidaysService;
@Service
@Transactional
public class ListOfHolidaysServiceImpl implements IListOfHolidaysService {


	@Autowired
	private HolidayRepository holidayRepository;

	@Override
	public ListOfHolidays findByType(String type) {
		return holidayRepository.findByType(type);

}

	@Override
	public ListOfHolidays registerHoliday(ListOfHolidays listOfHoliday) {
		return holidayRepository.save(listOfHoliday);
	}

	@Override
	public void deleteHoliday(int id) {
		 holidayRepository.deleteById(id);
	}

}
