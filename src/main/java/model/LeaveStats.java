package model;

public class LeaveStats {

	private Integer empId;
	private Float totalDays;
	private String leaveType;

	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	public Float getTotalDays() {
		return totalDays;
	}
	public void setTotalDays(Float totalDays) {
		this.totalDays = totalDays;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	
	@Override
	public String toString() {
		return "LeaveStats [empId=" + empId + ", totalDays=" + totalDays + ", leaveType=" + leaveType + "]";
	}
}
