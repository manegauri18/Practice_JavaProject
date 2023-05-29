package control_statements;

public class Sample10_Nested_if_find_tallest_student_among3 
{

	public static void main(String[] args) 
	{
		int a=180;
		int b=150;
		int c=164;
		
		if(a>=b)
		{
		  
		  if(a>=c)
		  {
			 
			
			if(b>c)
			{
				System.out.println("Student b is taller than c");
			}
			else
			{
				System.out.println("Student b is shorter than c");
			}
		  }
		  
		  else
		  {
			  System.out.println("a is shorter than c");
		  }
		}
		
		else
		{
			System.out.println("not tall");
		}
	}
}
