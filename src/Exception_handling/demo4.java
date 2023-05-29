package Exception_handling;

public class demo4 
{
	public static void main(String[] args) 
	{
		String s1="abcd";
		
		
		try
		{
			System.out.println(s1.charAt(6));  //risky code
		}
		
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		
		catch(ArithmeticException e2)
		{
			System.out.println("ArithmeticException handled");
		}
		catch(StringIndexOutOfBoundsException e3)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		
		System.out.println("Hi");
		
	
		
	}

}
