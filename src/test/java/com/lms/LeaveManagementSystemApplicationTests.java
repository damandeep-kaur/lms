package com.lms;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.lms.services.IEmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeaveManagementSystemApplicationTests {
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mvc;
	@MockBean
	private IEmployeeService employeeService;
	@Before
	public void setUp() {
	mvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	@Test
	public void contextLoads() {
	}

	@Test
	public void testEquals()
	{
		String str="Hello";
		assertEquals("Hello",str);
	}
	@Test
	public void testEquals1()
	{
		String str="Hello";
		assertEquals("Hello",str);
	}
	@Test
	public void testCreateEmptyJsonGivesError() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api/viewAll").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
}
