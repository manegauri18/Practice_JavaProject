package Array_practice;

public class Ex5_MultiDimensional_array 
{
	public static void main(String[] args) 
	{
		int ar[][]=new int[2][3];
	
//	i 	0   1  2 
//	0	20 40 10
//	1	15 35 17
//		
		ar[0][0]=20;
		ar[0][1]= 40;
		ar[0][2]=10 ;
		ar[1][0]=15;
		ar[1][1]=35;
		ar[1][2]=17;
		
		for(int i=0; i<=1; i++) 
		{
			for(int j=0; j<=2; j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
		
			
		
	}

}
