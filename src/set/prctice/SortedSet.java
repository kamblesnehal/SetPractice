package set.prctice;

import java.util.TreeSet;

public class SortedSet 
{
	public static void main(String[] args) 
	{
		TreeSet s = new TreeSet();
		s.add("P");
		s.add("L");
		s.add("V");
		s.add("R");
		s.add("M");
		System.out.println(s);                  // (L,M,P,R,V)
		
		System.out.println(s.comparator());     // null
        
		System.out.println(s.subSet("P", "V")); //(P,R)

		System.out.println(s.headSet("R"));     //(L,M,P)

		System.out.println(s.tailSet("L"));     //(L,M,P,R,V)
		
		System.out.println(s.first());          //(L)
		
		System.out.println(s.last());           //(V)



	}

}
