package Array;

public class Example2_integerArray
{
	public static void main(String[] args) 
	{
		//array declaration
		int ar1 []=new int[3];
		
		//array initialization
		ar1[0]=101;
		ar1[1]=102;
		ar1[2]=103;
		
		//array usage
		System.out.println(ar1[1]);
		System.out.println(ar1[2]);
		
		//to find length of string
		System.out.println(ar1.length);   //3
		
		System.out.println("-----Print all data from integer array-----");
		
		for(int i=0; i<=ar1.length-1; i++)
		{
			System.out.println(ar1[i]);
		}
		
		
	}

}
