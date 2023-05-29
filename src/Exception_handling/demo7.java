package Exception_handling;

public class demo7 
{
	public static void main(String[] args)
	{
		String s1="abcd";
		int ar []= {10,20,30,40};
		
		try
		{
			System.out.println(s1.charAt(5));  //risky code1
		}
		catch(StringIndexOutOfBoundsException e1)
		{
			System.out.println("String Index Out Of Bounds Exception handled");
		}
		
		try
		{
			System.out.println(ar[6]);  //risky code2
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled");
		}
		
		System.out.println("Hello");
	}

}
