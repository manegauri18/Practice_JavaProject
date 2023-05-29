package variable_types;

public class Sample2 
{
	//static global variable
	
	static int a=15;
	
	public static void m1()
	{
		System.out.println(a);	//15
	}
	
	public void m2()
	{
		int b=26;
		System.out.println(a);  //15
		System.out.println(b);  //26
	}
	
	public static void main(String[] args) 
	{
		Sample2 s2=new Sample2();
		s2.m1();
		s2.m2();
		System.out.println(Sample3.c);
		
	}

}
