package Exception_handling;

public class Example3 
{
	public static void main(String[] args) 
	{
	  int a=10;
	  int b=0;
	  int div=0;
	
	  try
	  {
		System.out.println(div=a/b);  //risky code
	  }
	
	  catch(ArithmeticException e2)
	  {
		//div=a/1;
		System.out.println("Arithmetic Exception handled");
	  }
	
	System.out.println(div);
	
	System.out.println("Hiiiiii");
	}
	

}
