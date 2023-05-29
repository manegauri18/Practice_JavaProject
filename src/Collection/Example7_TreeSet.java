package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Example7_TreeSet 
{
	public static void main(String[] args)
	{
		TreeSet tr = new TreeSet();
		tr.add(101);
		tr.add(105);
		tr.add(102);
		tr.add(104);
		tr.add(106);
	//	tr.add(101);
		
		System.out.println(tr);
		System.out.println(tr.size());
		System.out.println(tr.isEmpty());
		
		tr.remove(105);
		System.out.println(tr);
		
		//to fetch first element info
		System.out.println(tr.first());
		
		//to fetch last element info
		System.out.println(tr.last());
		
		//to remove element from first position
		tr.pollFirst();
		System.out.println(tr);
		
		//to remove element from last position
		tr.pollLast();
		System.out.println(tr);
		
		System.out.println("---Print all info using iterator cursor---");
		Iterator itr = tr.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all info using forEach loop---");
		for(Object s1 : tr)
		{
			System.out.println(s1);
		}
		
		
	}

}
