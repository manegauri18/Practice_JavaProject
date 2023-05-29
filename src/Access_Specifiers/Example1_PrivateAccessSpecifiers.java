package Access_Specifiers;

public class Example1_PrivateAccessSpecifiers 
{
	private int a;
	
	private Example1_PrivateAccessSpecifiers()
	{
		a=10;
	}
	
	private void m1()
	{
		System.out.println("Running method m1");
	}
	
	public static void main(String[] args)
	{
		Example1_PrivateAccessSpecifiers e1=new Example1_PrivateAccessSpecifiers();
		System.out.println(e1.a);
		e1.m1();
		
	}

}
