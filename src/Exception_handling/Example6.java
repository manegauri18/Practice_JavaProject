package Exception_handling;

public class Example6 
{
	public static void main(String[] args)
	{
		String s1="velocity";
		
		try
		{
			System.out.println(s1.charAt(10));  //risky code
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		catch(ArithmeticException e1)
		{
			System.out.println("ArithmeticException handled");
		}
		catch(StringIndexOutOfBoundsException e2)
		{
			System.out.println("StringIndexOutOfBoundsException handled");
		}
		
		System.out.println("HELLO");
		
	}

}
