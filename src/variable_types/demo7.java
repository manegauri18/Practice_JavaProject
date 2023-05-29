package variable_types;

public class demo7
{
   //Example: static variable call from same class
	
	static int f=45;
	public static void main(String[] args) 
	{
	   System.out.println(f);	             //Static variable call from same class
		
		System.out.println("------------");
		
		System.out.println(demo8.g);         //Static variable call from diff. class
	}
	
	public static void m1()
	{
		System.out.println(f);
	}
	
	public void m2()
	{
	  System.out.println(f);	
	}
}
