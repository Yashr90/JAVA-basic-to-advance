package Java;

class Parent1 {
    // parent
}

class Chd extends Parent1 {

}

public class Main_instance {

    public static void main(String[] args) {

        Chd obj = new Chd();
        System.out.println(obj instanceof Chd);
        System.out.println(obj instanceof Parent1); //added to demonstrate inheritance

    }
}

//create cmp class under emp class use if condition and instance keyword emp1 having obj and emp2 having obj we want to check each class having object or not?