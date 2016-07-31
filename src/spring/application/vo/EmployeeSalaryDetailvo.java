package spring.application.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="emp_dtl_sal")
@Entity
public class EmployeeSalaryDetailvo {
@Id
@Column(name="emp_id")
private int empID;
@Column(name="emp_sal")
private int empSalary;

public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
public int getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}

}
