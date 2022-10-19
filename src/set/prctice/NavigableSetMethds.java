package set.prctice;

import java.util.*;

public class NavigableSetMethds 
{
	public static void main(String[] args)
{
     NavigableSet ns = new TreeSet();
     ns.add(45);
     ns.add(47);
     ns.add(23);
     ns.add(11);
     ns.add(7);
     
     System.out.println(ns);
     
     System.out.println(ns.lower(47));

     System.out.println(ns.floor(47));

     System.out.println(ns.higher(23));
     
     System.out.println(ns.ceiling(7));

     System.out.println(ns.pollFirst());

     System.out.println(ns.pollLast());

     System.out.println(ns.subSet(23, 47));
     
     System.out.println(ns.headSet(45));
 
     System.out.println(ns.tailSet(11));
     
     
     Iterator<Integer> itr = ns.iterator();
     
     
     while(itr.hasNext()) 
     {
     
    	 System.out.println("Value: " + itr.next() + " ");

     }

     Iterator<Integer> itr1 = ns.descendingIterator();
     while(itr1.hasNext()) 
     {
     
    	 System.out.println("Value: " + itr1.next() + " ");

     }


}
}
