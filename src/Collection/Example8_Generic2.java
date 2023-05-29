package Collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class Example8_Generic2 
{
	public static void main(String[] args)
	{
//		TreeSet<String> tr = new TreeSet<String>();
//		tr.add("Ramesh");
//		tr.add("Ganesh");
//		tr.add("Mahesh");
//		tr.add("Lokesh");
//		
//		for(String s1 : tr)
//		{
//			System.out.println(s1);
//		}
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("gauri");
		al.add("neel");
		al.add("sagar");
		al.add("om");
		al.add("akshu");
		
		for(String s1 : al)
		{
			System.out.println(s1);
		}
		
	}

}
