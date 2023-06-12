package com.advanto.pack1;

public class ExceptionDemo {

	
	public static void main(String[] args) {
//		try{
//		int i=10/0;
//		}catch(ArithmeticException e) {
//			System.out.println("number not divided by zero");
//		}
//		try{
//			Integer.parseInt("xyz");
//		}catch( NumberFormatException e) {
//			System.out.println("number format exception");
//		}
		System.out.println("step 1");
		try {
		System.out.println("step 2");
		int i=10/0;
		System.out.println("step 3");
		Integer.parseInt("xyz");
		System.out.println("step 4");
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException is handled");
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException is handled");
		}
		System.out.println("step 5");
	}

}
