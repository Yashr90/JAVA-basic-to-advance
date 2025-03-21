package Java.work;

class EmployeeDetails {
    private String employeeName;
    private int employeeId;
    private double employeeSalary;
    private String employeeDepartment;

    EmployeeDetails(String employeeName, int employeeId, double employeeSalary, String employeeDepartment) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
        this.employeeDepartment = employeeDepartment;

        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Salary: " + employeeSalary);
        System.out.println("Employee Department: " + employeeDepartment);
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name (using method): " + employeeName);
        System.out.println("Employee ID (using method): " + employeeId);
        System.out.println("Employee Salary (using method): " + employeeSalary);
        System.out.println("Employee Department (using method): " + employeeDepartment);
    }

   
    }

public class Employee {
    public Employee(String string, int i, double d, String string2) {
		
	}

	public static void main(String[] args) {
        EmployeeDetails emp1 = new EmployeeDetails("John Doe", 12345, 60000.0, "Software Development");
        emp1.displayEmployeeDetails();
        
    }
}