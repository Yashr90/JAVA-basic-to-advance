package Java.work;  // Ensure the package matches your folder structure

class Emp {
    private int empId = 1001;
    private String empName = "Yash";
    private int salary = 50000;
    private String address = "Bengaluru";
    private String phone;

    // Constructor
    public Emp() {
        this.phone = "Not Set";
    }

    // Getters
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    // Setter for Phone
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Method to display all details
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }
}

public class EmpDetails {
    public static void main(String[] args) {
        Emp ex = new Emp();
        ex.setPhone("9999999999"); // Setting phone number

        // Display all details
        ex.displayDetails();
    }
}
