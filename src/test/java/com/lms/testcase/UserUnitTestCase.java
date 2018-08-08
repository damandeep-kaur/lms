package com.lms.testcase;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.lms.LeaveManagementSystemApplication;
import com.lms.model.Employee;
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
	
	
	
	@Test
	public void createUserTest3() {
		Employee ee=new Employee();
		ee.setFirstName("abc");
		ee.setLastName("xyz");
		ee.setPassword("qwe");
		ee.setUserName("pqr");
		ee.setId(1);
		
		Mockito.when(employeeService.registerEmployee(ee)).thenReturn(ee);
		String url = "http://localhost:" + port + "/api/add";
		HttpEntity<Employee> entity = new HttpEntity<>(ee);
		//ResponseEntity<Employee> response = restTemplate.exchange(url, HttpMethod.POST, entity, Employee.class);
		ResponseEntity<Employee> response = restTemplate.postForEntity(url, entity, Employee.class);
		System.out.println(response.getBody());
		Employee ee1=response.getBody();
		assertNotNull(ee1);
		assertEquals(200, response.getStatusCodeValue());
		assertThat(ee1.getUserName(), is("pqr"));
	}

}
