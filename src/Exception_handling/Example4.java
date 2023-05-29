package Exception_handling;

public class Example4 
{
	public static void main(String[] args)
	{
		String s1="xyz";
		int [] ar= {10,20,30,40};
		
		try
		{
			System.out.println(s1.charAt(5));   //risky code
		}
		catch(StringIndexOutOfBoundsException e4)
		{
			System.out.println("String Index Out Of Bounds Exception handled");
		}
		
		System.out.println("Hello");
		
		try
		{
			System.out.println(ar[7]);   //risky code
		}
		catch(ArrayIndexOutOfBoundsException e4)
		{
			System.out.println("Array Index Out Of Bounds Exception handled");
		}
	}

}
