package set.prctice;

import java.util.*;

public class HashMapDemo2
{
	public static void main(String[] args) 
	{ 
		HashMap hash_map= new HashMap();
		hash_map.put("KING", 100);
		hash_map.put("CLARK", 90);
		hash_map.put("BLAKE", 10);
		hash_map.put("FORD", 110);
		hash_map.put("SMITH", 10);
		hash_map.put("WARD", 99);
		hash_map.put("JONES", 99);
		System.out.println(hash_map);
		
		hash_map.get("CLARK");
		hash_map.get("KING");
		hash_map.get("WARD");
		System.out.println(hash_map);

	}

}
