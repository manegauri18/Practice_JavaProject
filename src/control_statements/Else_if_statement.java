package control_statements;

public class Else_if_statement 
{

	public static void main(String[] args)
	{
	
		int marks=30;
		
	  if(marks>=65)
	  {
		 System.out.println("Distinction"); 
	  }
	
	  else if(marks>=60 & marks<=64)
	  {
		  System.out.println("1st class");
	  }
		
	  else if(marks>=51 & marks<=59)
	  {
		  System.out.println("2nd class");
	  }
	  
	  else if(marks>=35 & marks<=50)
	  {
		  System.out.println("Pass");
	  }
	  
	  else
	  {
		  System.out.println("Fail");
	  }
	}
}
