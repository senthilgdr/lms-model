package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEE_SALARY_DETAILS")
public class EmployeeSalaryDetails {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "EMP_ID")
	private Employee employee;

	@Column(name = "BASIC_PAY")
	private Long basicPay;

	@Column(name = "HRA")
	private Long hra;

	@Column(name = "CONVEYANCE")
	private Long conveyance;

	@Column(name = "SPECIAL_ALLOWANCE")
	private Long specialAllowance;

	@Column(name = "MEDICAL_INSURANCE")
	private Long medicalInsurance;

	@Column(name = "PROVIDENT_FUND")
	private Long providentFund;

	@Column(name = "INCOME_TAX")
	private Long incomeTax;

	@Column(name = "ID")
	public Long getTotalEarnings() {
		return basicPay + hra + conveyance + specialAllowance + medicalInsurance;
	}

	@Column(name = "ID")
	public Long getTotalDeductions() {
		return providentFund + incomeTax;
	}
}
