package Loops;

public class Example23_for_loop     //Average of 1 to 10 num
{

	public static void main(String[] args) 
	{
	
		float sum=0f;
		float Avg=0f;
		
		for(int i=1; i<=10; i++)
		{
		  
			sum=sum+i;
			
			Avg=sum/10;
			
		
		}
		System.out.println("Average of 1 to 10 num is: "+ Avg);
		
		
		
		
	}
	
	
	
}
