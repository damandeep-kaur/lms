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
		   
	
	/*@Test
	public void createUserTest3() {
		Employee emp1=new Employee();
		emp1.setFirstName("abc");
		emp1.setLastName("xyz");
		emp1.setPassword("qwe");
		emp1.setUserName("pqr");
		emp1.setId(1);
		
		Mockito.when(employeeRepository.findByUserName(Mockito.anyString())).thenReturn(emp1);
		String url = "http://localhost:" + port + "/api/add";
		//HttpEntity<Employee> entity = new HttpEntity<>(emp1);
		//ResponseEntity<Employee> response = restTemplate.exchange(url, HttpMethod.GET, entity, Employee.class);
		//Employee emp=response.getBody();
		//assertNotNull(emp);
		
		Mockito.when(employeeService.registerEmployee(emp1)).thenReturn(emp1);
		HttpEntity<Employee> entity = new HttpEntity<>(emp1);
		//ResponseEntity<Employee> response = restTemplate.exchange(url, HttpMethod.POST, entity, Employee.class);
		ResponseEntity<Employee> response = restTemplate.postForEntity(url, entity, Employee.class);
		System.out.println(response.getBody());
		Employee ee1=response.getBody();
		assertNotNull(ee1);
		assertEquals(200, response.getStatusCodeValue());
		assertEquals("pqr", ee1.getUserName());
		
	}*/

}
