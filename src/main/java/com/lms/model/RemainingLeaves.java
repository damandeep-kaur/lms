package com.lms.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_leave_history")
public class RemainingLeaves {
	private int leavesId;
	private int casualLeaves;
	private int specialOccassionLeaves;
	private int OptionalHolidays;
	private Employee eid;
	

}
