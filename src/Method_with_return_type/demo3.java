package Method_with_return_type;

public class demo3 
{
	public static void main(String[] args)
	{
		int num1 = addition(10, 20);
		System.out.println(num1);    //30
		//or
		System.out.println(addition(5, 8));  //13
		System.out.println("----------------------------------");
		
		demo3 d3= new demo3();
		int num2 = d3.mul(4, 8);
		System.out.println(num2);  //32
		
		//or
		System.out.println(d3.mul(10, 70));  //700
		System.out.println("-------------------------------------");
		
		demo4 d4 = new demo4();
		int num3 = d4.sub(80, 30);
		System.out.println(num3);  //50
		
		//or
		System.out.println(d4.sub(10, 5));  //5
		
		String Student_Name = d4.convert_toLowerCase("GAURI");
		System.out.println(Student_Name);
	}
	
	public static int addition(int a, int b)
	{
		int c= a+b;
		return c;
	}
	
	public int mul(int c, int d)
	{
		int m= c*d;
		return m;
	}

}
