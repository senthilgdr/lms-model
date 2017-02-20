 package model;

import lombok.Data;

@Data
public class TaxDeclaration {

	private Long id;
	private Employee employee;
	private String panNo;
	private Float houseRent;
	private String houseOwnerName;	
	private Float medicalBills;
	private Float epfvpfContribution;
	private Float ppf;
	private Float scss;
	private Float nsc;
	private Float taxSavingFD;
	private Float taxSavingBonds;
	private Float taxSavingMutualFund;
	private Float lifeInsurancePremiums;
	private Float pensionPlan;
	private Float centralGovtPlan;
	private Float housingLoan;
	private Float sukanyaSamriddhiAccount;
	private Float stampDutyCharges;
	private Float tuitionFees;
	private Float additionalDeduction;
	private Float deductionRgess;
	private Float medicalInsuranceSelf;
	private Float medicalInsuranceParents;
	private Float educationLoan;
	private Float medicalTreatment;
	private Float expenditureMedicalTreatment;
	private Float donationApprovedFunds;
	private Float physicallyDisabled;
	
}
