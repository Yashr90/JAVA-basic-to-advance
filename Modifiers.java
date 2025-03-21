package Java;

class Mod{ //userdefined class
	public int a=100;
	private String name;
	
	public String getName() { //getter method
		return name;
		
	}
	
	public void setName(String name) { //setter method
		this.name=name;
	}
}

public class Modifiers { //public,private,protected,default,
	
	public  int a=100;//public
	protected int  b=200;//protected
	
	int c =300; //default
	
	private String name="Nokesh";//private
	
	

	public static void main(String[] args) {
		
		Modifiers obj=new Modifiers();//Main class object
		System.out.println("A value is:"+obj.a);
		System.out.println("B value is:"+obj.b);
		System.out.println("C value is:"+obj.c);
		
		System.out.println("Private");
		System.out.println("My name is:"+obj.name);
		
		System.out.println("Protected"); //userdefined object
        Mod m=new Mod();
        m.setName("Nokesh");
        System.out.println("a value is:"+m.a);
        System.out.println("b value is:"+obj.b);
        System.out.println("c value is:"+obj.c);
        System.out.println("My name is:"+m.getName());
       
        
        
        

	}

}
