package Method_with_return_type;

public class Sample1 
{
	public static void main(String[] args)
	{
		int num1 = addition(5,6);
		System.out.println(num1);
		
		System.out.println(addition(15,5));
		System.out.println("-------------------------");
		
		Sample1 s1= new Sample1();
		int num2 = s1.sub(80, 50);
		System.out.println(num2);
		
		System.out.println(s1.sub(20, 8));
		System.out.println("----------------------");
		
		Sample2 s2=new Sample2();
		String StudentName = s2.convertToUpperCase("gauri");
		System.out.println(StudentName);
		
		System.out.println(s2.convertToUpperCase("neel"));
		
	}

	
	public static int addition(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	
	public int sub(int c, int d)
	{
		int subtract=c-d;
		return subtract;
	}
}
