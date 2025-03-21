package Java.work;  // Ensure the package matches your folder structure

class Emp {
    private int empId = 101;
    private String empName = "Nokesh";
    private int salary = 20000;
    private String address = "xyz street";
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
        ex.setPhone("8688238202"); // Setting phone number

        // Display all details
        ex.displayDetails();
    }
}
