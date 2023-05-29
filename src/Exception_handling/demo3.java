package Exception_handling;

public class demo3 
{
	public static void main(String[] args)
	{
		String s1="abcd";
		
		try
		{
		  System.out.println(s1.charAt(5));  //risky code
		}
		
		catch(StringIndexOutOfBoundsException e2)
		{
			System.out.println("String Index Out Of Bounds Exception handled");
		}
		
		System.out.println("Hello");
	}

}
