package variable_types;

public class Sample1
{
	//local & global variable
	
	int a=10;    //global variable
	
	public void m1()
	{
		int b=20;  //local variable
		
		System.out.println(b);
		System.out.println(a);
	}
	
	public void m2()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		Sample1 s1=new Sample1();
		s1.m1();
		s1.m2();
		
		
	}

}
