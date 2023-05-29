package control_statements;

public class nested_if_3 
{
   public static void main(String[] args)
   {
	

	String gender="female";
	int PEM=500;
	int MEM=750;
	
	if(gender=="female")
	{
		System.out.println("check for PEM");
		
		if(PEM>=500)
		{
			System.out.println("Selected for mains exam");
			
			
			if(MEM>=800)
			{
				System.out.println("Got selected");
			}
			else
			{
				System.out.println("Rejected from mains exam: MEM<800");
			}
		}
		else
		{
			System.out.println("rejected from PE: PEM<500");
		}
	}
	
	else
	{
		System.out.println("rejected");
	}
   }	
}
