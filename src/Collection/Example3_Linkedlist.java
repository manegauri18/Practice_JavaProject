package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Example3_Linkedlist 
{
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		
		ll.add("Nilam");
		ll.add(102);
		ll.add(65.4f);
		ll.add('B');
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.get(1));
		
		//update or modify any values
		ll.set(4, "puja");
		System.out.println(ll);
		
		System.out.println("---Add info in between linkedlist---");
		ll.add(2, "kamlesh");
		System.out.println(ll);
		
		System.out.println("---remove info in between linkedlist---");
		ll.remove(4);
		System.out.println(ll);
		
		System.out.println("---Print all data using iterator cursor---");
		Iterator itr = ll.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all data using List_iterator cursor---");
		ListIterator litr = ll.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---Print all data using for loop---");
		for(int i=0; i<=ll.size()-1; i++)
		{
			System.out.println(ll.get(i));
		}
		
		System.out.println("---Print all data using for Each loop---");
		
		for(Object s1 :ll)
		{
			System.out.println(s1);
		}
		
		ll.clear();
		System.out.println(ll.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
