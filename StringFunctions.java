package com.advanto.pack1;

public class StringFunctions {

	public static void main(String[] args) {
	/*	String str1 = "java developer";
		System.out.println(str1.length());// it also measure space.
		String str2 = " developer";
		System.out.println(str2.length());// it counts space too
		System.out.println(str1.isEmpty());//if str1 is empty then it return true otherwise false.
		System.out.println(str1.concat(str2));//add 2nd string from end of 1st string
		System.out.println(str1.contains("va"));//it check the given string is present in str1 or not.
		System.out.println(str1.contains(str2));//check str2 is present in str1 or not.
		//it also check the spaces of sub string...
		
	*/
	/*
		String str1 = "java";
		String str2 = "JAVA ";
		System.out.println(str1.equalsIgnoreCase(str2));//it ignore the case of string.
		System.out.println(str1.equalsIgnoreCase("JAVA"));//return false when string is different.
	*/
	
	/*
		String str1="java";
		index always start from 0
		System.out.println(str1.indexOf("v"));//2
		System.out.println(str1.indexOf("va"));//2
		System.out.println(str1.lastIndexOf("a"));//return last index of given string.
	*/
		
	/*
		String str1 = "java";
		System.out.println(str1.replace("a","b"));//it replace all "a" to "b".
		
	*/
		
	/*
		String str1 = "java Developer";
		char ch = str1.charAt(0);//return one character from string
		System.out.println(ch);// ch=j
		
	*/
		
	/*
		String str1 = "java Developer";
		System.out.println(str1.toUpperCase());//JAVA DEVELOPER
		String str2 = "JAVA DEVELOPER";
		System.out.println(str2.toLowerCase());//java developer
		
	*/
	
	/*
		//if we want to delete space from front and end of the string then we use trim().
		String str1 = " java ";
		String str2 = "java";
		//System.out.println(str1.equals(str2));//false
		System.out.println(str2.equals(str1.trim()));//true
		
	*/
	/*	
		String str1 = "java Developer";
		String str2 = str1.substring(6,9);//it return string from index 6 to 8 but not 9th character(before 9th)
		System.out.println(str2);
	*/
		
	/*
		String str1 = "java Developer";
		String[] s = str1.split("a");
		for(String s1:s) {
			System.out.println(s1);
			}
	*/
	
	/*
		String str = "vinayak vitthal mohol";
		String str2 = "vina";
		System.out.println(str.startsWith("vina"));//true
		System.out.println(str.startsWith(str2));//true
		System.out.println(str.startsWith("ina"));//false
	*/
	/*	
		String str = "vinayak vitthal mohol";
		String str2 = "hol";
		System.out.println(str.endsWith("hol"));//true
		System.out.println(str.endsWith(str2));//true
		System.out.println(str.endsWith("ho"));//false
	
	*/
		
	}

}
