package Abstract_concrete_class;
//Can we overload main method--->yes, we can overload main method in one class
public class Assignment1 
{
	public static void main(int a) 
	{
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		System.out.println("Running main method");
		main(20);
	}

}
