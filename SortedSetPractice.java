package java_selenium_project_pack1;

import java.util.Iterator;
import java.util.TreeSet;

public class SortedSetPractice {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		//it store only same type of data because it sort the data in ascending form
		ts.add(10);
//		ts.add("abc");
		//if we add another type of data then it will throw ClassCastException exception
		ts.add(20);
		ts.add(30);
		ts.add(40);
		System.out.println(ts);
		
		ts.remove(30);//value as an argument
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.contains(30));
		
		
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
