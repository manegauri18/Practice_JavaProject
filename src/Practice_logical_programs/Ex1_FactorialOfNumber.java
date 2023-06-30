package Practice_logical_programs;

public class Ex1_FactorialOfNumber 
{
	public static void main(String[] args)
	{
		int num1=5;  //5*4*3*2*1
		int fact=1;
		
		for(int i=num1; i>=1; i--)
		{
			fact= fact*i;
		}
		
		System.out.println(fact);
	}

}
