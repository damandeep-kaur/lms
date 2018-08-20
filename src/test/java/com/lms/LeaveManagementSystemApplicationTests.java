package com.lms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LeaveManagementSystemApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testEquals()
	{
		String str="Hello";
		assertEquals("Hello",str);
	}
	
}
