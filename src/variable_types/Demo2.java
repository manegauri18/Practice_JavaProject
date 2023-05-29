package variable_types;

public class Demo2 
{
  //Ex. Static global variable
	
	static int a=20;
	public static void main(String[] args) 
	{   
		System.out.println(a);      //Static global variable call from same class
		
		System.out.println(Demo3.b);
		
	
	}
	
	public static void m1()
	{
		System.out.println(a);
	}
	
	public void m2()
	{
		System.out.println(a);
	}
	
}
