package Java;

class Parents{ //parent class,super,derived 
	public void parent_method() {
		System.out.println("IAM IN PARENT METHOD");
		
	}
}
class Child1 extends Parents{ //child class or sub class 
	public void child1_method() {
		System.out.println("IAM IN CHILD METHOD 1");
	}
}
class Child2 extends Child1{ //child class or sub class 
	public void child2_method() {
		System.out.println("IAM IN CHILD METHOD 2");
	}
}

public class MultiLevel_Inheritance {//main class

	public static void main(String[] args) {
		Child1 c=new Child1();
		c.parent_method();
		c.child1_method();
		Child2 c1=new Child2();
		c1.child2_method();
		
		

	}

}





























