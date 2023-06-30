package Array_practice;

public class Ex7_FindHighestValue 
{
	public static void main(String[] args) 
	{
		int ar[]= {10,40,20,80,65};
		
		int min=ar[0];
		int max=ar[0];
		
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
			
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println("Highest value in array is: "+max);
		
	}

}
