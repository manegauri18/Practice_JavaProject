package Exception_handling;

public class Example1 
{
	public static void main(String[] args) 
	{
		String s1="abcd";
		
		try
		{
			System.out.println(s1.charAt(6));   //risky code
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index Out Of Bounds Exception handled");
		}
		
		System.out.println("Hiii");
		
	}

}
