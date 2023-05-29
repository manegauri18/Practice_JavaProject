package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example1_Array_list 
{
	public static void main(String[] args)
	{
	    //ArrayList al = new ArrayList();  //default capacity of arraylist is 10
	    ArrayList al = new ArrayList(8);   //initial capacity=8
	    
	    al.add("Gauri");
	    al.add(101);
	    al.add(75.5f);
	    al.add('A');
	    al.add(null);
	    al.add(null);
	    
	    System.out.println(al);
	    System.out.println(al.size());  //6
	    System.out.println(al.get(2));  //75.5
	    System.out.println(al.isEmpty());  //false
	    
	    //add info in between arraylist---> right shift operation
	    al.add(1, 300);
	    System.out.println(al);
	    
	    //remove info in between arraylist----> left shift operation
	    al.remove(2);
	    System.out.println(al);
	    
	    System.out.println("---Print all info using Iterator cursor---");
	   Iterator itr = al.iterator();
	   
	   while(itr.hasNext())  //true
	   {
		   System.out.println(itr.next());
	   }
	    
	   System.out.println("---Print all info using ListIterator cursor---");	 
	   ListIterator litr = al.listIterator();
	   
	   while(litr.hasNext())
	   {
		   System.out.println(litr.next());
	   }
	   
	   System.out.println("---Print all info using for loop---");
	   for(int i=0; i<=al.size()-1; i++)
	   {
		   System.out.println(al.get(i));
	   }
			   
	   System.out.println("---Print all info using for each loop---");		
	   for(Object s1:al)
	   {
		   System.out.println(s1);
	   }
	   
	   System.out.println("----------------");
	   System.out.println(al.size());
	   al.clear();
	   System.out.println(al.size());
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
			   
		
	}

}
