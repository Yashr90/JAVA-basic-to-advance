package Java;

class OverloadExample {

    // Method with one integer parameter
    public void display(int a) {
        System.out.println("Integer: " + a);
    }

    // Method with two integer parameters
    public void display(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    // Method with one string parameter
    public void display(String s) {
        System.out.println("String: " + s);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();

        obj.display(10);          // Calls the method with one integer parameter
        obj.display(10, 20);      // Calls the method with two integer parameters
        obj.display("Hello!");    // Calls the method with one string parameter
    }
}
