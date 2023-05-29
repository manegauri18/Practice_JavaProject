package Array;

public class Example3_PrintArrayInReverseOrder 
{
	public static void main(String[] args)
	{
		int ar []=new int[4];
		
		ar[0]=20;
		ar[1]=12;
		ar[2]=16;
		ar[3]=19;
		
		System.out.println(ar[1]);   //12
		System.out.println(ar[3]);   //19
		
		System.out.println("-----Print info of original integer array------");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("----Print array in reverse order------");
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
		
		
	}

}
