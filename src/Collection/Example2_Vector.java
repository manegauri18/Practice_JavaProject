package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Example2_Vector 
{
	public static void main(String[] args)
	{
		Vector V=new Vector();   //default capacity 10
		
		V.add("Rupali");
		V.add(110);
		V.add(74.5f);
		V.add('A');
		V.add(null);
		V.add(null);
		
		System.out.println(V);
		System.out.println(V.size());  //6
		System.out.println(V.isEmpty());   //false
		System.out.println(V.get(1));  //110
		
		//add info in between vector
	    V.add(3, 'D');
		System.out.println(V);
		
		//remove info in between vector
		V.remove(1);
		System.out.println(V);
		
		System.out.println("---Print all info using iterator cursor---");
		Iterator itr = V.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("---Print all info using ListIterator cursor---");
		ListIterator litr = V.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("---Print all info using for loop---");
		for(int i=0; i<=V.size()-1; i++)
		{
			System.out.println(V.get(i));
		}
		
		System.out.println("---Print all info using forEach loop---");
		for(Object s1 :V)
		{
			System.out.println(s1);
		}
		
		System.out.println("---Print all info using Enumerator cursor---");
		Enumeration enu = V.elements();
		
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
		
		V.clear();
		System.out.println(V.size());
		
		
		
	}

}
