package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Example6_LinkedHashSet 
{
	public static void main(String[] args) 
	{
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("priya");
		lhs.add(108);
		lhs.add(78.6f);
		lhs.add('B');
		lhs.add("priya");
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println(lhs.isEmpty());
		
		//to remove info in between linkedhashset
		lhs.remove(108);
		System.out.println(lhs);
		
		System.out.println("---Print all info from linked Hash set using iterator cursor---");
		Iterator itr = lhs.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all info from linked Hash set using forEach loop---");
		for(Object s1 : lhs)
		{
			System.out.println(s1);
		}
		
		lhs.clear();
		System.out.println(lhs.size());
		
		
		
		
		
		
		
		
		
	}

}
