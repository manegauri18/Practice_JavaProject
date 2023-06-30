package Array_practice;

public class Ex1_StringArray 
{
	public static void main(String[] args)
	{
		String ar [] = new String [5];
		ar[0]="Gauri";
		ar[1]="Neel";
		ar[2]="Sai";
		ar[3]="Sakshi";
		ar[4]="Ovi";
		
		System.out.println(ar[2]);
		System.out.println(ar.length);   //5
		
		System.out.println("---Print all data in array---");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}

}
