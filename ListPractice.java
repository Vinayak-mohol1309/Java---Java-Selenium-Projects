package java_selenium_project_pack1;

import java.util.ArrayList;
import java.util.Iterator;
//java.lang class is bydefault loaded.
public class ListPractice {

	public static void main(String[] args) {
		ArrayList arrLst = new ArrayList();
		//every element we store in arrLst is an object and we can store any type of data.
		//stored elements are in form of list in an array form.
		
		//to add
		arrLst.add(10);
		arrLst.add("abc");
		arrLst.add(new ListPractice());
		arrLst.add(10);//Duplicate is allowed
		
		System.out.println(arrLst);//print all elements in array format
		
		arrLst.add(3, 10.34f);// add value(second arg) in 3rd index
		System.out.println(arrLst);// bit shifting occurs
		
		arrLst.remove(4);//removes the element at given index
		System.out.println(arrLst);
		 
		boolean result= arrLst.contains("abc");
		System.out.println(result);//true
		
		System.out.println(arrLst.size());// size/length of the array
		
		int ind = arrLst.indexOf(10.34f); //also give last f
		System.out.println(ind);// give the index of given element
		
		//simple for loop
		for(int i=0;i<arrLst.size();i++) {
			System.out.println(arrLst.get(i));// this method return the element of given index
		}
		
		//enhanced for loop
		for(Object obj:arrLst) {
			System.out.println(obj);
		}
		
		//using iterator interface
		Iterator itr = arrLst.iterator();// this method return the object of Iterator interface
		
		while(itr.hasNext()) {// check till the itr has next element , if not then terminates the loop
			//now itr holding arrLst elements
			System.out.println(itr.next());//returns the element 1: first element then next
		}
		
		
	}

}
