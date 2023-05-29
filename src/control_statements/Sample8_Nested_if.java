package control_statements;

public class Sample8_Nested_if 
{

	public static void main(String[] args) 
	{
	
		int SA=6000;
		
		if(SA>=500)
		{
			System.out.println("free delivery");
			
			if(SA>=5000)
			{
				System.out.println("10% dicount");
			}
			
			else
			{
				System.out.println("no discount");
			}
		}
		
		else
		{
			System.out.println("extra charges will be applied");
		}
		
		
		
	}
	
	
	
}
