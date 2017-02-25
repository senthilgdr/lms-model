package model;

public class LeaveStatistics {

	private Integer empId;
	
	private Float noOfCasualLeaves;
	
	private Float noOfPaidLeaves;

	private Float noOfSickLeaves;
	
	public Float getNoOfPaidLeaves() {
		return noOfPaidLeaves;
	}

	public void setNoOfPaidLeaves(Float noOfPaidLeaves) {
		this.noOfPaidLeaves = noOfPaidLeaves;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Float getNoOfCasualLeaves() {
		return noOfCasualLeaves;
	}

	public void setNoOfCasualLeaves(Float noOfCasualLeaves) {
		this.noOfCasualLeaves = noOfCasualLeaves;
	}

	public Float getNoOfSickLeaves() {
		return noOfSickLeaves;
	}

	public void setNoOfSickLeaves(Float noOfSickLeaves) {
		this.noOfSickLeaves = noOfSickLeaves;
	}

	
}
