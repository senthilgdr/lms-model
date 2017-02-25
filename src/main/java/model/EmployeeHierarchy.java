package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE_HIERARCHY")
public class EmployeeHierarchy {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;

	@Column(name = "EMP_ID")
	private Employee employee;

	@Column(name = "MGR_ID")
	private Employee manager;

}
