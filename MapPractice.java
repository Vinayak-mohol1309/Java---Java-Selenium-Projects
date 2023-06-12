package java_selenium_project_pack1;

import java.util.HashMap;
import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		//it store the elements in key-value format
		hm.put(1,10);// 1st arg = key and 2nd arg = value
		hm.put("pqr", false);
		hm.put(10.12f, 'a');
		hm.put(2, "abc");
		System.out.println(hm);
		
		System.out.println(hm.size());//4
		
		hm.remove(2);//pass key as an argument
		System.out.println(hm);
		
		//duplicate key are not accepted but same value and different key is accepted
//		hm.put(1, 10.11f); not accept if key is same
		hm.put(2, "abc");
		hm.put(3, "abc");
		System.out.println(hm);//{pqr=false, 1=10, 2=abc, 3=abc, 10.12=a}
		
		boolean containKey = hm.containsKey(2);
		System.out.println(containKey);
		
		boolean containValue = hm.containsValue("abc");
		System.out.println(containValue);
		
		//to retrieve , we can use get() method. pass key as an arg
		System.out.println(hm.get(1));
		
		//enhanced for loop
		Set s = hm.keySet();// store all the keys in one array
		System.out.println(s);
		for(Object obj:s) {
			System.out.println(hm.get(obj));
		}
		
	}

}
