package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TAX_DECLARATION")
public class TaxDeclaration {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "EMP_ID")
	private Employee employee;

	@Column(name = "PAN_NUMBER")
	private String panNo;

	@Column(name = "HOUSE_RENT")
	private Integer houseRent;

	@Column(name = "HOUSE_OWNER_NAME")
	private String houseOwnerName;

	@Column(name = "MEDICAL_BILLS")
	private Integer medicalBills;

	@Column(name = "EPF_VPF_CONTRIBUTION")
	private Integer epfvpfContribution;

	@Column(name = "PPF")
	private Integer ppf;

	@Column(name = "SENIOR_CITITIZEN")
	private Integer scss;

	@Column(name = "NSC")
	private Integer nsc;

	@Column(name = "TAX_SAVING_FD")
	private Integer taxSavingFD;

	@Column(name = "TAX_SAVING_BONDS")
	private Integer taxSavingBonds;

	@Column(name = "ELSS")
	private Integer taxSavingMutualFund;

	@Column(name = "LIFE_INSURANCE")
	private Integer lifeInsurancePremiums;

	@Column(name = "PENSION_PLAN")
	private Integer pensionPlan;

	@Column(name = "CENTRAL_GOVT_PENSION_PLAN")
	private Integer centralGovtPlan;

	@Column(name = "HOUSING_LOAN")
	private Integer housingLoan;

	@Column(name = "SUKANYA_SAMRIDDHI_ACCOUNT")
	private Integer sukanyaSamriddhiAccount;

	@Column(name = "STAMP_DUTY_CHARGES")
	private Integer stampDutyCharges;

	@Column(name = "TUITION_FEES")
	private Integer tuitionFees;

	@Column(name = "ADDITIONAL_DEDUCTION")
	private Integer additionalDeduction;

	@Column(name = "DEDUCTION_RGESS")
	private Integer deductionRgess;

	@Column(name = "MEDICAL_INSURANCE_SELF")
	private Integer medicalInsuranceSelf;

	@Column(name = "MEDICAL_INSURANCE_PARENTS")
	private Integer medicalInsuranceParents;

	@Column(name = "EDUCATION_LOAN")
	private Integer educationLoan;

	@Column(name = "MEDICAL_TREATMENT")
	private Integer medicalTreatment;

	@Column(name = "EXPENDITURE_MEDICAL_TREATMENT")
	private Integer expenditureMedicalTreatment;

	@Column(name = "DONATION_APPROVED_FUNDS")
	private Integer donationApprovedFunds;

	@Column(name = "PHYSICALLY_DISABLED_ASSESSE")
	private Integer physicallyDisabled;

}
