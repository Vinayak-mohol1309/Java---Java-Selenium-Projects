package com.advanto.pack1;

public class WrapperClass {

	public static void main(String[] args) {
		int i=100;
		Integer i2 = new Integer(i);//Autoboxing
		//System.out.println(i2);
		Integer i1 = new Integer(10);
		//System.out.println(i1);// it prints the value not address.
		//System.out.println(i);
		int a = i2.intValue();  //Unboxing
		System.out.println(a);
	}

}
