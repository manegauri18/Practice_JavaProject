package Constructor;

public class Sample7 
{
  // Example: User defined constructor with parameter
	
	int num1;  //global variable declaration
	int num2;
	
	Sample7(int a, int b)  //local variable int a & int b
	{
		num1=a;
		num2=b;     //assigning local variable info to global variable
	}
	
	public void addition()
	{
	  System.out.println(num1+num2);	
	}
	
	public void sub()
	{
		System.out.println(num1-num2);
	}
	
	public static void main(String[] args) 
	{
		Sample7 s7=new Sample7(40,30);
		s7.addition();  //70           //user defined constructor with parameter call from same class
		s7.sub();      //10
		
		System.out.println("------------");
		
		Sample7 s8=new Sample7(100,50);
				s8.addition();  //150
		        s8.sub();      //50
		        
		 System.out.println("-----------------------");  
		 
		 Sample8 s9=new Sample8(7,6);  //user defined constructor with parameter call from diff class
				 s9.mul();  //42
				 
		 Sample8 s10=new Sample8(10,4);
		         s10.mul();  //40
	}
}
