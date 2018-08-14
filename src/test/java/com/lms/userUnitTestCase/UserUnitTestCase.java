package com.lms.userUnitTestCase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import com.lms.LeaveManagementSystemApplication;
import com.lms.repositories.EmployeeRepository;
import com.lms.services.IEmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LeaveManagementSystemApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(LeaveManagementSystemApplication.class)
public class UserUnitTestCase {

	@Autowired
	private TestRestTemplate restTemplate;
	
	@LocalServerPort
	Integer port;

	@MockBean
	IEmployeeService employeeService;
	
	@MockBean
	EmployeeRepository employeeRepository;
	
	
		   @Test
			public void testAdd() {
		      String str = "Junit is working fine";
		      assertEquals("Junit is working fine",str);
		   }
		   

}
