package Array;

public class Example11 
{
	public static void main(String[] args) 
	{
		
		
        int ar []=new int[4];
		
		ar[0]=30;
		ar[1]=20;
		ar[2]=40;
		ar[3]=10;
		
		int max=ar[0];
		
		for(int i=1; i<ar.length; i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println(max+" "+ "is Highest number in array");
		
		System.out.println("---Extracting Lowest number----");
		int min=ar[0];
		for(int i=1; i<ar.length; i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		System.out.println(min+" "+ "is Lowest number in array");
	}

}
