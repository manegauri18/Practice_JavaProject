package Array;

public class Example8
{
	public static void main(String[] args) 
	{
		//2*3 multi-dimensional array
		//     0  1  2
		// 0  20 40 10
		// 1  10 30 70
		
		int ar [][]=new int[2][3];
		
		ar[0][0]=20;
		ar[0][1]=40;
		ar[0][2]=10;
		ar[1][0]=10;
		ar[1][1]=30;
		ar[1][2]=70;
		
		System.out.println(ar[1][2]);  //70
		System.out.println("----Print all info----");
		
		for(int i=0; i<=1; i++)  //Outer loop for rows
		{
			for(int j=0; j<=2; j++)   //Inner loop for column
			{
				System.out.print(ar[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
