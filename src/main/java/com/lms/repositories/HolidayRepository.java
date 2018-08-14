package com.lms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.model.Employee;
import com.lms.model.ListOfHolidays;

@Repository
public interface HolidayRepository extends JpaRepository<ListOfHolidays, Integer>{
	ListOfHolidays findByType(String type);

}
