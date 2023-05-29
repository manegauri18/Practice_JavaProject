package variable_types;

public class demo5 
{
   // Example4: Non static variable call from same class
	int c=35;
	
	public static void main(String[] args) 
	{
		demo5 d5=new demo5();
		System.out.println(d5.c);
		
		System.out.println("---------------");
		
		demo6 d7=new demo6();
		System.out.println(d7.d);
			
	}
	
	public static void m1()
	{
		demo5 d6=new demo5();
		System.out.println(d6.c);
			
	}
	
	public void m2()
	{
		System.out.println(c);
	}
	
}
