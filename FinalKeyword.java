package Java;

 class Final {
    public final void final_method1() { // Added final keyword here
        System.out.println("Iam final method");
    }
}

class Final1 extends Final {
    

    public void final_method2() {
        System.out.println("Iam final1 method");
    }
}

public class FinalKeyword {

    public static void main(String[] args) {
        final int a = 100;

        System.out.println("A value:" + a);
        Final f = new Final();

        f.final_method1();

        Final1 f1 = new Final1();
        f1.final_method1(); // Calling the inherited final method.
        f1.final_method2(); // Calling the method defined in Final1.

       // a = 200;  // This will cause a compile-time error because 'a' is final.
    }
}	
