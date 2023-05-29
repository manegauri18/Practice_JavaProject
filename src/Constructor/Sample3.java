package Constructor;

public class Sample3 
{

	public static void main(String[] args) 
	{
	 
		Sample3 s3=new Sample3();  //Sample3()-->Default constructor made by compiler
		   s3.gauri1();
		
		gauri2();
		
		System.out.println("-------------------");
		
		Sample4 s4=new Sample4();  //Sample4()--->Default constructor of class-sample4 which is also made by compiler
				s4.gauri3();
		
	}
	
	
	public void gauri1()
	{
		System.out.println("Running method, gauri1");
	}
	
	public static void gauri2()
	{
		System.out.println("Running method, gauri2 ");
	}
	
}
