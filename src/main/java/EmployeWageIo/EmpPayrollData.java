package EmployeWageIo;

public class EmpPayrollData {
	int employeeId;
	String employeeName;
	double employeeSalary;

	public EmpPayrollData(Integer id, String name, Double salary) {

	        this.employeeId = id;
	        this.employeeName = name;
	        this.employeeSalary = salary;
	    }

	@Override
	public String toString() {

		return "Employee Details:\nEmployee Id: " + employeeId + "\nEmployee Name: " + employeeName
				+ "\nEmployee Salary: " + employeeSalary;
	}
}
