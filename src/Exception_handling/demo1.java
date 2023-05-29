package Exception_handling;

public class demo1 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=0;
		int div=0;
		
		try
		{
		  div=a/b;
		}
		
		catch(ArithmeticException e)
		{
			//div=a/1;
			System.out.println("Arithmetic Exception handled");
		}
		
		System.out.println(div);
		
		System.out.println("Hi");
		
	}

}
