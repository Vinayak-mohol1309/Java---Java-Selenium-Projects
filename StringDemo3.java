package com.advanto.pack1;

public class StringDemo3 {

	public static void main(String[] args) {
		//All the values below are stored in string constant pool...
		String s1 = "java";
		String s2 = " Developer";
		String s3 = s1+s2;//it is a different type
		System.out.println(s3);
		String s4 = "java Developer";
		System.out.println(s4);
		System.out.println(s3==s4);
		String s5 = "java" + " Developer";//it is a different type
		System.out.println(s5);
		System.out.println(s3 == s5);
		System.out.println(s4 == s5);
		String s6 = s1 + " Developer";
		System.out.println(s3 == s6);
		System.out.println(s4 == s6);
		System.out.println(s4.equals(s6));
	}

}
