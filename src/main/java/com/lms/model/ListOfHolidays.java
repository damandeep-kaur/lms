package com.lms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "list_of_holidays")
public class ListOfHolidays implements Serializable {

	private static final long serialVersionUID = 4145574083833380135L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name = "date")
	private Date date;
	@Column(name = "description")
	private String description;
	@Column(name = "type")
	private String type;

	@Override
	public String toString() {
		return "ListOfHolidays [id=" + id + ", date=" + date + ", description=" + description + ", type=" + type + "]";
	}

	public ListOfHolidays(Integer id, Date date, String description, String type) {
		super();
		this.id = id;
		this.date = date;
		this.description = description;
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ListOfHolidays() {
		// TODO Auto-generated constructor stub
	}
}
