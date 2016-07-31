package spring.application.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "emp_dtl")
@Entity
public class EmployeeDetailvo {
	
	@Id
	@Column(name="emp_no")
	private int empNo;
	@Column(name="emp_nm")
	private String empName;
	@Column(name="emp_Add")
	private String empAddress;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

}
