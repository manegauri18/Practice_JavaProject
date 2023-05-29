package Exception_handling;

public class demo2 
{
	public static void main(String[] args) 
	{
		int ar []= {1,2,3,4};
		
		ar[0]=1;
		
		System.out.println(ar.length);    //4
		
		try
		{
		  System.out.println(ar[6]);
		}
		
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(ar[2]);   //alternate solution
			System.out.println("Array Index Out Of Bounds Exception handled");
		}
		
		System.out.println("Hello");
	}

}
