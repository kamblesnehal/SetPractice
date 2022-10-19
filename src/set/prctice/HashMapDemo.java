package set.prctice;

import java.util.HashSet;

public class HashMapDemo 
{
	public static void main(String[] args)
	{
		String s1= "AAA";
		String s2= "BBB";
		String s3= "CCC";
		String s4= "AAA";
		String s5= "CCC";
		
		HashSet hs = new HashSet();
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		
		System.out.println(hs);

	}
}
