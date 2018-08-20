package com.lmsAddUsers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import com.lms.LeaveManagementSystemApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = LeaveManagementSystemApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(LeaveManagementSystemApplication.class)
public class AddUserTestCases {
	@Test
	public void testEquals1()
	{
		String str="Hello";
		assertEquals("Hello",str);
	}

}
