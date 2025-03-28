package app;

public class multiplle_exceptiion {
	public static void main(String[] args) {
		try {
			//ArithmaticException
			int div = 10/0;
			
			//ArrayOutOfBoundException
			int []numbers= {1,2,3,4,5};
			
			System.out.println("My number:"+numbers[10]);
			
			//StringIndexOutOfBoundException
			String name="yash";
			System.out.println("My name:"+name.charAt(15));
			
			//NullPointerException
			String a=null;
			System.out.println("My String:"+a.length());
		}
			
		catch(ArithmeticException e){
			System.out.println("My first"+e);
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("My second"+e);
			
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("My third"+e);
			
		}
		catch(NullPointerException e){
			System.out.println("My fourth"+e);
			
		}
		finally {
			System.out.println("my four excepttion is solving");
		}
	}

}
