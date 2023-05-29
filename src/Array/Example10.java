package Array;

public class Example10 
{
	//Find highest & lowest number in array
	public static void main(String[] args) 
	{
		int ar []=new int[4];
		
		ar[0]=30;
		ar[1]=20;
		ar[2]=40;
		ar[3]=10;
		
		if(ar[0]>ar[1] && ar[0]>ar[2] && ar[0]>ar[3])
		{
			System.out.println(ar[0]+ "is highest number");
		}
		else if(ar[1]>ar[0] && ar[1]>ar[2] && ar[1]>ar[3])
		{
			System.out.println(ar[1]+ "is highest number");
		}
		else if(ar[2]>ar[0] && ar[2]>ar[1] && ar[2]>ar[3])
		{
			System.out.println(ar[2]+" "+ "is highest number");
		}
		else
		{
			System.out.println(ar[3]+"is Highest number");
		}
		
	}

}
