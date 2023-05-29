package Access_Specifiers;

public class Example3 
{
	protected int a;
	
	protected Example3()
	{
		a=10;
	}
	
	protected void m1(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args)
	{
		Example3 e3=new Example3();
		e3.m1(5, 15);
		System.out.println(e3.a);
		
	}

}
