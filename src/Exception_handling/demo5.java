package Exception_handling;

public class demo5 
{

	public static void main(String[] args) 
	{
		String s1="abcd";
		
		try
		{
			System.out.println(s1.charAt(6));  //risky code
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Generic Exception handled");
		}
		
		System.out.println("Hi");
	}

}
