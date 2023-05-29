package combiningallmethods;
//main method overloading
public class method_overloading 
{
	public static void main(String[] args)
	{
		
		main("Gauri", 101);
		main(10,5,12);
		
	}
	
	public static void main(String sname, int srollnum)
	{
		System.out.println("student name: "+sname +" , "+"student roll num: "+ srollnum);
		
	}
	
	public static void main(int num1, int num2, int num3)
	{
		System.out.println(num1+num2+num3);
	}

}
