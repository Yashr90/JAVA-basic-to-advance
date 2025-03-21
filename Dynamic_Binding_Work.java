package Java.work;

class Anml{
	public void sound() {
		System.out.println("Animal Sound:");
	}
class Cat extends Anml{
	@Override
	public void sound() {
		System.out.println("Meewo");
	}
}

}

public class Dynamic_Binding_Work {

	public static void main(String[] args) {
	  
		CAT c =new CAT();
		c.CAT_Method();
		
		

	}

}
