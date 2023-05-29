package Exception_handling;

public class Example8 
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
		catch(Exception e1)
		{
			e1.printStackTrace();
			System.out.println("Generic Exception handled");
		}
		
		System.out.println("Hello");
	}

}
