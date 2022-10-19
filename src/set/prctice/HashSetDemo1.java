package set.prctice;
import java.util .*;

public class HashSetDemo1 
{
	public static void main(String[] args) 
	{
		Student s1 = new Student(10,"AAA");
		Student s2 = new Student(20,"BBB");
		Student s3 = new Student(30,"CCC");
		Student s4 = new Student(10,"AAA");
		
		ArrayList al = new ArrayList();
        al.add(s2);
        al.add(s1);
        al.add(s3);
        al.add(s4);
        
        HashSet hs = new HashSet(al);
        System.out.println(hs);
	}

}
