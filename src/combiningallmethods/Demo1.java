package combiningallmethods;

public class Demo1 
{

	public static void main(String[] args)
	{
	
		System.out.println("Hi");
		
		gauri1();
		
		Demo1 d1=new Demo1();
		d1.gauri2();
		
		
		Demo2.gauri3();
		
		Demo2 d2=new Demo2();
		d2.gauri4();
		
		
		
	}
	
	public static void gauri1()
	{
		System.out.println("Running static regular method from same class");
	}
	
	public void gauri2()
	{
		System.out.println("Running non static regular method from same class");
	}
	
	
	
	
	
}
