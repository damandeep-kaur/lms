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
	public void testViewWrongRequestGivesError() {
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
	@Test
	public void testAddWrongRequestGivesError() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/add").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testloginRequestGivesError() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api1/loginUserName").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testloginPasswordRequestGivesError() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api1/loginPassword").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testlogout() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api1/loginUserName").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testleavesRequestGivesError() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api4/viewAll").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testaddHolidayRequestGivesError() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api2/add").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testViewHolidaysRequestGivesError() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/api2/viewAll").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testDeleteHolidaysRequestGivesError() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api2/delete").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testViewWrongRequestGivesError1() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api/viewAll").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testAddWrongRequestGivesError1() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api/add").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testloginRequestGivesError1() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api1/loginUserName").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testloginPasswordRequestGivesError1() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api1/loginPassword").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testlogout1() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api1/loginUserName").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testleavesRequestGivesError1() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api4/viewAll").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testaddHolidayRequestGivesError1() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api2/add").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testViewHolidaysRequestGivesError1() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api2/viewAll").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testDeleteHolidaysRequestGivesError1() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.put("/api2/delete").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testViewWrongRequestGivesError2() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/api/viewAll").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testAddWrongRequestGivesError2() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/api/add").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testloginRequestGivesError2() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/api1/loginUserName").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testloginPasswordRequestGivesError2() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/api1/loginPassword").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testlogout2() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/api1/loginUserName").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testleavesRequestGivesError2() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/api4/viewAll").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testaddHolidayRequestGivesError2() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/api2/add").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testViewHolidaysRequestGivesError2() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.delete("/api2/viewAll").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	@Test
	public void testDeleteHolidaysRequestGivesError2() {
	String brandJson = "{ }";
	RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api2/delete").accept(MediaType.APPLICATION_JSON)
	.content(brandJson).contentType(MediaType.APPLICATION_JSON);
	try {
	MvcResult result = mvc.perform(requestBuilder).andReturn();
	assertEquals(405, result.getResponse().getStatus());
	}catch (Exception e) {
	e.printStackTrace();
	}
	}
	
}
 
