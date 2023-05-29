package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Example4_HashSet1 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		hs.add("Neel");
		hs.add(101);
		hs.add(74.5f);
		hs.add('A');
		hs.add(101);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
		//To remove info in between hashset
		hs.remove('A');
		System.out.println(hs);
		
		System.out.println("----Print all info from hashSet using iterator----");
		Iterator itr = hs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("----Print all info from hashSet using forEach loop----");
		for(Object s1 : hs)
		{
			System.out.println(s1);
		}
		
		hs.clear();
		System.out.println(hs.size());
		
		
		
		
		
		
	}

}
