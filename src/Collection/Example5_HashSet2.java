package Collection;

import java.util.ArrayList;
import java.util.HashSet;


public class Example5_HashSet2 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("Neel");
		al.add(101);
		al.add(74.5f);
		al.add('A');
		al.add(101);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		
		
		HashSet hs = new HashSet(al);
		
		System.out.println(hs);
		
		
	}

}
