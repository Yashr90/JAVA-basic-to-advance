package Java;

public class Class_Objects{
	String name;
	int age;
public Class_Objects(String string, int i) {
		// TODO Auto-generated constructor stub
	}
public void student(String name,int age) {
	this.age=age;
	this.name=name;
	
}
public void display() {
	System.out.println("Std NAme:"+name+"Age:"+age);
}
public static void main(String[]args) {
	Class_Objects s1=new Class_Objects("nokesh",20);
	s1.display();
}
}
