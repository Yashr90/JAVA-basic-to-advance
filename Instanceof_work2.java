package Java.work;
class Emp4 {
    String name;

    // Constructor to initialize the Emp object with a name
    public Emp4(String name) {
        this.name = name;
    }

    // Static nested class Cmp
    static class Cmp {
        // Method to check if the object is an instance of Emp
        public void checkObj(Emp4 emp) {
            if (emp instanceof Emp4) {
                System.out.println(emp.name + " has an object.");
            } else {
                System.out.println(emp.name + " does not have an object.");
            }
        }
    }

    public static void main(String[] args) {
        // Create two Emp objects
        Emp4 emp1 = new Emp4("John");
        Emp4 emp2 = new Emp4("Alice");

        // Create an object of the nested Cmp class
        Cmp cmp = new Cmp();

        // Check for emp1 and emp2
        cmp.checkObj(emp1);  // Should
}
}
