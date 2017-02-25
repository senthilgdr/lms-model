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
@Table(name = "EMPLOYEE_JOB_HISTORY")
public class EmployeeJobHistory {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "EMP_ID")
	private Employee employee;

	@Column(name = "DESIGNATION")
	private String designation;

	@Column(name = "DEPARTMENT")
	private String department;

	@Column(name = "DATE_OF_JOINING")
	private LocalDate joiningDate;

	@Column(name = "END_OF_RELEVING")
	private LocalDate relievingDate;

}
