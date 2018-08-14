package com.lms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lms.model.Employee;
import com.lms.model.ListOfHolidays;
import com.lms.repositories.EmployeeRepository;
import com.lms.repositories.HolidayRepository;
import com.lms.services.IEmployeeService;
import com.lms.services.IListOfHolidaysService;

@RestController
@RequestMapping("/api2")
public class ListOfHolidayController {
	@Autowired
	private IListOfHolidaysService iListOfHolidaysService;

	@Autowired
	private HolidayRepository holidayRepository;

	@GetMapping("/viewAll")
	public List<ListOfHolidays> retrieveAllHolidays() {
		return holidayRepository.findAll();

	}

	@RequestMapping(value="/add",method=RequestMethod.POST)
	public void add(@RequestBody ListOfHolidays listOfHolidays) {
		Map<String,String> map=new HashMap<>();
		iListOfHolidaysService.registerHoliday(listOfHolidays);

				
	}

}
