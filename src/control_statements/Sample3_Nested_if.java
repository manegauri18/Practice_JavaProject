package control_statements;

public class Sample3_Nested_if    //assignment
{
   public static void main(String[] args)
   {
	
	   int SA=11000;
	   
	   if(SA>=500)
	   {
		   System.out.println("Free delivery");
		   
		   if(SA>=10000)
		   {
			  System.out.println("10% discount"); 
		   }
		   
		   else
		   {
			   System.out.println("No discount");
		   }
		   
		   
	   }
	   
	   else
	   {
		   System.out.println("50 Rs. delivery charges are applied: SA<500");
	   }
	   
	   
	   
	   
	   
   }

}
