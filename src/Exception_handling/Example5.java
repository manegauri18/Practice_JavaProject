package Exception_handling;

public class Example5 
{
	public static void main(String[] args)
	{
		String s1="xyz";
		int [] ar= {10,20,30,40};
		
		try
		{
			try
			{
				System.out.println(ar[8]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array Index Out Of Bounds Exception handled");
			}
			System.out.println(s1.charAt(5));
			
		}
		
		catch(StringIndexOutOfBoundsException e1)
		{
			System.out.println("String Index Out Of Bounds Exception handled");
		}
		
		System.out.println("Hello");
		
	}

}
