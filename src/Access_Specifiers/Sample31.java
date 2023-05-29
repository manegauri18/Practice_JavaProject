package Access_Specifiers;

public class Sample31 
{  //Example: public access specifier
	
	public int d;
	
	public Sample31()
	{
		d=25;
	}
	
	public void m1()
	{
		System.out.println("Running method m1");
	}
	
	public static void main(String[] args) 
	{
		Sample31 s31=new Sample31();
		s31.m1();
		System.out.println(s31.d);
		
	}

}
