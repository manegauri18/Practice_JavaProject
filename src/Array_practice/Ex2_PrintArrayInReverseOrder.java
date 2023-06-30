package Array_practice;

public class Ex2_PrintArrayInReverseOrder 
{
	public static void main(String[] args) 
	{
		
		int ar []= {12,7,15,3,1,6};
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("---Print data in reverse order---");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
		
	}

}
