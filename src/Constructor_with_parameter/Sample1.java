package Constructor_with_parameter;
//Example: Addition, multiplication & subtraction of 2 variables using constructor

public class Sample1 
{
  int num1;  //global variable declaration
  int num2;
  
  Sample1(int a, int b)  //user defined constructor with parameter
  {
	 num1=a;   //global variable initialization
	 num2=b;
  }
  
  public void add()
  {
	  System.out.println(num1+num2);   //global variable usage
  }
  
  public void mul()
  {
	  System.out.println(num1*num2);   ////global variable usage
  }
  
  public static void main(String[] args) 
  {
	Sample1 s1=new Sample1(10,15);
	s1.add();
	s1.mul();
	
	System.out.println("---------------------");
	
	Sample1 s2=new Sample1(5,6);
	s2.add();
	s2.mul();
	
	System.out.println("*********************************************");
	
	Sample2 s4=new Sample2(40,20);
	s4.sub();
	
	System.out.println("---------");
	
	Sample2 s5=new Sample2(120,60);
	s5.sub();
	
	
}
}
