package control_statements;

public class Sample4_nested_if 
{

	public static void main(String[] args) 
	{
	
		int PEM=400;   //if PEM is greater than 500 then pass
		int MEM=700;
		
		if(PEM>=500)
			
			
		{
			System.out.println("Appeared for mains exam");
			
			if(MEM>=800)
			{
				System.out.println("Got selected");
			}
			
			else
			{
				System.out.println("Rejected in mains exam: MEM<800 ");
			}
				
			
		}
		
		else
		{
			System.out.println("Rejected from PE: PEM<500");
		}
		
		
			
	}

}
