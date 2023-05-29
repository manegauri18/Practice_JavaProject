package nonstaticregularmethod;

public class Sample2 
{

	public static void main(String[] args)
	{
	
		System.out.println("Hi");
		
		Sample2 s2=new Sample2();
		s2.m1();
		
		
	}
	
	
	public void m1()
	{
		System.out.println("Running non static regular method from same class");
		
	}
	
	
}
