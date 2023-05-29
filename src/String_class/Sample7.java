package String_class;

public class Sample7
{
	public static void main(String[] args) 
	{
		String s1="Welcome to the world of java programming";
		
		String [] ar = s1.split(" ");
		
		System.out.println(ar[2]);  //the
		
		System.out.println(ar.length);  //7
		
		System.out.println("---------------------");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
	}

}
