package set.prctice;

import java.util.HashSet;

public class HashMapDemo1 
{
	public static void main(String[] args) 
	{
		String s1= "AAA";
		String s2= "BBB";
		String s3= "CCC";
		String s4= "DDD";
		String s5= "EEE";
		String s6= "FFF";
		String s7= "GGG";
		String s8= "HHH";
		String s9= "III";
		String s10= "JJJ";
		String s11= "KKK";
		String s12= "LLL";
		
		HashSet hs = new HashSet();
        
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);
		hs.add(s7);
		hs.add(s8);
		hs.add(s9);
		hs.add(s10);
		hs.add(s11);
		hs.add(s12);
	
		System.out.println(hs); //s1-s12 all print
		
		String s13= "MMM";
		hs.add(s13);
		System.out.println(hs);  // add 13th element but internally
                                 // list is grow 2*n+1=2*4+1=32

	}

}
