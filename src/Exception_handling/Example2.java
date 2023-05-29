package Exception_handling;

public class Example2
{
	public static void main(String[] args) 
	{
		int [] ar= {40,10,30,20};
		
		try
		{
			System.out.println(ar[8]);   //risky code
		}
		
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Array Index Out Of Bounds Exception handled");
		}
		
		System.out.println("Hello");
	}

}
