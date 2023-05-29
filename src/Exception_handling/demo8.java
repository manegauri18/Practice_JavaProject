package Exception_handling;

public class demo8 
{
	public static void main(String[] args) 
	{
		String s1="abcd";
		int ar []= {10,20,30,40};
		
		try
		{
			try   //nested try block
			{
				System.out.println(s1.charAt(6));  //risky code1
			}
			catch(StringIndexOutOfBoundsException e1)
			{
				System.out.println("StringIndexOutOfBoundsException handled");
			}
			
			System.out.println(ar[7]);  //risky code2
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		
		System.out.println("Hello");
		
	}

}
