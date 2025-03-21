package Java;
//dynamic binding or late binding in polymorphsim
class Animal{ //parent class
	public  void sound() {
		
		System.out.println("Animal Sounds:");
	}
}
class Dog extends Animal{ //child class
	
	@Override
	public  void sound() {
		
		System.out.println("Bark");
	}
	
	
}
public class Dynamic_Binding {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();
		
		
		
	}

}
