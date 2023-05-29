package Array;

public class Example12 
{
	public static void main(String[] args) 
	{

        int ar []=new int[4];
		
		ar[0]=30;
		ar[1]=20;
		ar[2]=40;
		ar[3]=10;
		
		int max=ar[0];  //max=40
		int min=ar[0];
		
		       //3   4
		for(int i=1; i<ar.length; i++)
		{
			if(ar[i]>max)     //10>30
			{
				max=ar[i];
			}	
		}
		System.out.println(max+ " is Maximum number in arrray");
		
		for(int i=1; i<ar.length; i++)
		{
			if(ar[i]<min)     //10>30
			{
				min=ar[i];
			}	
		}
		
		System.out.println(min+ " is Minimum number in arrray");
	}

}
