package Access_Specifiers;

public class Sample1 
{   
	//Example1: Private access specifier
	
	private int a;
	
	private Sample1()
	{
		a=10;
	}
	
	private void Print_sq_of_num()
	{
		System.out.println(a*a);
	}
	
	public static void main(String[] args) 
	{
	    Sample1 s1=new Sample1();
	    s1.Print_sq_of_num();
	    
	    System.out.println(s1.a);
	}

}
