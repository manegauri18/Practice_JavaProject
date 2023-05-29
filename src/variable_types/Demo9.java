package variable_types;

public class Demo9 
{
    int a=10;    //non-static global variable
    
	public static void main(String[] args) 
	{
	
		Demo9 d9=new Demo9();
		System.out.println(d9.a);   //Non-static variable call from same class
		
		m1();    //static method m1 call from same class
		d9.m2();   //Non static method m2 call from same class
		
		
		System.out.println("---------------------");
		
		Demo10 d12=new Demo10();
		System.out.println(d12.g);    //Non-static variable call from diff class
	}
	
	public static void m1()
	{
		Demo9 d10=new Demo9();
		System.out.println(d10.a);
		
	}
	
	public void m2()
	{
		System.out.println(a);
	}
	
	
	
	
	
}
