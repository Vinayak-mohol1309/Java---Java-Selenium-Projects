package com.advanto.pack1;

public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = new String("Developer");
		String s3 = "java";
		String s4 = new String("Developer");
		System.out.println(s1==s3);
		System.out.println(s2==s4);
		String s5 = new String("java");
		System.out.println(s1==s5);//check the address
		System.out.println("------------");
		System.out.println(s1.equals(s3));//checks the content
		System.out.println(s2.equals(s4));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s2));
	}

}
