package com.lms.controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.model.Employee;
import com.lms.services.IEmployeeService;
import com.lms.services.IRedis;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("/api1")
public class AuthenticationController {
	@Autowired
	private IEmployeeService employeeService;
	@Autowired
	private IRedis redis;
	@Autowired
	private RedisTemplate<String, Object> template;
	
	@PostMapping("/loginUserName")
	public  Map<String,String> loginUsername(@RequestBody Employee employee) {
		Map<String,String> map=new HashMap<>();
		Employee employee1 = employeeService.findByUserName(employee.getUserName());

		if (employee1 == null) {
			map.put("message","Employee does not exist") ;
			map.put("status",HttpStatus.CONFLICT.toString());
			
		}
		else
		{
			map.put("message","Employee exist") ;
			map.put("status",HttpStatus.ACCEPTED.toString());
			
		}
		return map;
		
	}
	@PostMapping("/loginPassword")
	public String loginPassword(@RequestBody Employee employee) {
	
		{
			Employee employee1 = employeeService.findByUserName(employee.getUserName());
			
			if (employee1.getPassword().equals(employee.getPassword())) {
					try {
						Object token = Jwts.builder().setSubject("users/TzMUocMF4p").setExpiration(new Date(1300819380))
								.claim("name", "Robert Token Man").claim("scope", "self groups/admins")
								.signWith(SignatureAlgorithm.HS256, "secret".getBytes("UTF-8")).compact();
						redis.setValue(employee.getUserName(), token);
						
						 //userService.registerUser(user); 
						return "Successfully Login";
					} catch (UnsupportedEncodingException e) {

						e.printStackTrace();
					}
				} else {
					
					return "Wrong Password";
					//userService.registerUser(user1);
				}
			
		}
		return "";

	}
	
	@PostMapping("/logout")
	public String logout(@RequestBody Employee employee) {
		
		redis.deleteValue(employee.getUserName());

return "Sucessfully logout";

	}
}
