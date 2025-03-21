package Java;


public class Polymorphsim_Second {

    static class Poly { // Parent class should be static to be used in main
        public void poly_method() {
            System.out.println("Parent class");
        }
    }

    static class Child extends Poly { // Child class should also be static
        @Override
        public void poly_method() {
            System.out.println("Child method");
        }
    }

    public static void main(String[] args) {
        // Create a Child object and call its method
        Child c = new Child();
        c.poly_method();  // This will print "Child method"
    }
}
