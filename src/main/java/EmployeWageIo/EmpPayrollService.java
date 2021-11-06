package EmployeWageIo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpPayrollService {
	public enum IoService {
        CONSOLE_IO, FILE_IO, DB_IO, REST_IO
    }

    private List<EmpPayrollData> employeePayrollList;

    public EmpPayrollService(List<EmpPayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }
    public static void main(String[] args) {

        System.out.println("----------- Welcome To Employee Payroll Application ----------\n");
        ArrayList<EmpPayrollData> employeePayrollList = new ArrayList<EmpPayrollData>();
        EmpPayrollService employeePayrollService = new EmpPayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);

        employeePayrollService.readEmployeePayrollData(consoleInputReader);
        employeePayrollService.writeEmployeePayrollData();

    }

    private void readEmployeePayrollData(Scanner consoleInputReader) {

        System.out.println("Enter the Employee Id : ");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter the Employee Name : ");
        String name = consoleInputReader.next();
        System.out.println("Enter the Employee Salary : ");
        double salary = consoleInputReader.nextDouble();

        employeePayrollList.add(new EmpPayrollData(id, name, salary));
    }

    private void writeEmployeePayrollData() {
        System.out.println("\nWriting Employee Payroll Roster to Console\n" + employeePayrollList);
    }

}
