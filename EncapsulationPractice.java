package com.advanto.pack2;

class EP{
	private int a=100;
	private String str = "vinayak";
	
	int getterMethod() {
		return a;
	}
	
	String getterMethod2() {
		return str;
	}
	
	//setter method always takes an argument(SMARTCODE)
	void setterMethod(int x , String y) {
		a=x;
		str = y;//reinitialize the values of a , str
	}
	
	//we can directly send values but everytime we have change the code while changing the value(HARDCODE)
//	void setterMethod() {
//		a=10;
//		str = "prerana";
//	}
	
}
public class EncapsulationPractice {
	
	public static void main(String[] args) {
		/*
		 * Encapsulation :- packing of data and function into single component and hiding it's internal 
		 * Implementation. hiding data by making it private.
		*/
		EP ep1 = new EP();
		int j = ep1.getterMethod();
		System.out.println(j);//100
		String name = ep1.getterMethod2();
		System.out.println(name);//vinayak
// by using argumented setter method we can change the value as we want.		
		ep1.setterMethod(10,"prerana");
//		ep1.setterMethod();
		System.out.println(ep1.getterMethod());
		System.out.println(ep1.getterMethod2());
		
	}

}
