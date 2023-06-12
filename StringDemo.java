package com.advanto.pack1;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hellow";
		System.out.println(s1);
		String s2 = new String("Hellow");
		System.out.println(s2);
		String s3 = "Hellow";
		String s4 = new String("Hellow");
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4));
//we use equals() method on objects to check the content  of object.that is why is is not for primitive type.
	}

}
