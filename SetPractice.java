package java_selenium_project_pack1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetPractice {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		//LinkedHashSet lhs = new LinkedHashSet();// it is same as HashSet but it store element in ordered form
		
		//every inserted element is an object
		hs.add(10);
		hs.add("abc");
		hs.add(10.12f);
		hs.add('a');
		hs.add(false);
		hs.add(10);
		//store randomly
		System.out.println(hs);//[a, abc, 10.12, false, 10] overrides the value when duplication is occur
		
		boolean result = hs.contains(10.12f);
		System.out.println(result);//true
		
		hs.remove(10.12f);
		System.out.println(hs);
		
		int size = hs.size();
		System.out.println(size);
		
		//we can't use simple for loop because set is index independent
		//enhanced for loop
		for(Object obj:hs) {
			System.out.println(obj);
		}
		
		//using Iterator interface
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
