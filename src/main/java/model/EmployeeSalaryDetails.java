package model;

import lombok.Data;

@Data
public class EmployeeSalaryDetails {

	private Long id;
	private Long empId;
	private Long basicPay;
	private Long hra;
	private Long conveyance;
	private Long specialAllowance;
	private Long medicalInsurance;

}
