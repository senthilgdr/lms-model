package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE_LEAVE_DETAILS")
public class LeaveDetail {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "EMP_ID")
	private Employee employee;

	@Column(name = "LEAVE_TYPE")
	private LeaveType leaveType;

	@Column(name = "FROM_DATE")
	private LocalDate fromDate;

	@Column(name = "TO_DATE")
	private LocalDate toDate;

	@Column(name = "NO_OF_DAYS")
	private Float noOfDays;

	@Column(name = "APPLIED_DATE")
	private LocalDate appliedDate;

	@Column(name = "MODIFIED_BY")
	private Employee modifiedBy;

	@Column(name = "STATUS_ID")
	private LeaveStatus status;

	@Column(name = "MODIFIED_DATE")
	private LocalDate modifiedDate;

}
