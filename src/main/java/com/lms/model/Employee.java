package com.lms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "employees")
public class Employee implements Serializable {

	private static final long serialVersionUID = 4145574083833380135L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "first_name",nullable=false)
	private String firstName;
	@Column(name = "last_name",nullable=false)
	private String lastName;
	@Column(unique = true, name = "user_name",nullable=false)
	private String userName;
	@Column(name = "password",nullable=false)
	private String password;
	@Column(name = "role",nullable=false)
	private String role;

	@Column(name = "casual_leaves",nullable=false)
	private int casualLeaves;
	@Column(name = "optional_holidays",nullable=false)
	private int optionalHolidays;
	@Column(name = "special_occassion_leaves",nullable=false)
	private int specialOccassionLeaves;
	

	

	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getRole() {
		return role;
	}




	public void setRole(String role) {
		this.role = role;
	}




	public int getCasualLeaves() {
		return casualLeaves;
	}




	public void setCasualLeaves(int casualLeaves) {
		this.casualLeaves = casualLeaves;
	}




	public int getOptionalHolidays() {
		return optionalHolidays;
	}




	public void setOptionalHolidays(int optionalHolidays) {
		this.optionalHolidays = optionalHolidays;
	}




	public int getSpecialOccassionLeaves() {
		return specialOccassionLeaves;
	}




	public void setSpecialOccassionLeaves(int specialOccassionLeaves) {
		this.specialOccassionLeaves = specialOccassionLeaves;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	public Employee(Integer id, String firstName, String lastName, String userName, String password, String role,
			int casualLeaves, int optionalHolidays, int specialOccassionLeaves) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.casualLeaves = casualLeaves;
		this.optionalHolidays = optionalHolidays;
		this.specialOccassionLeaves = specialOccassionLeaves;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", password=" + password + ", role=" + role + ", casualLeaves=" + casualLeaves + ", optionalHolidays="
				+ optionalHolidays + ", specialOccassionLeaves=" + specialOccassionLeaves + "]";
	}




	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
