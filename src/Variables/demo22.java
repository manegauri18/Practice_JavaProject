package Variables;

public class demo22 
{
  public static void main(String[] args) 
  {
	int num1=10;
	int num2=20;
	
	System.out.println("before swap: ");
	System.out.println("first num is: "+ num1);
	System.out.println("second num is: "+ num2);  
	
	
	num1=num1+num2;  //30
	num2=num1-num2;  //10
	num1=num1-num2;  //20
	  
	  
	System.out.println("after swap: ");
	System.out.println("first num is: "+ num1);
	System.out.println("second num is: "+ num2); 
	
}
	
	
}
