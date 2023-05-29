package Loops;

public class Example30_reverse_number 
{
   public static void main(String[] args) 
   {
	
	   int orgNum=1234;
	   int revNum=0;
	   
	   for(int i=orgNum; i>0; i=i/10)
	   {
		   int rem=i%10;
		   revNum=revNum*10 + rem;
		   
	   }
	   
	  System.out.println("Reverse num is: "+ revNum); 
}
}
