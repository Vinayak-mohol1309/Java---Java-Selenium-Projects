package com.advanto.pack1;

class polymorphism2{
	void msg() {
		System.out.println("hiiiiii");
	}
}
class polymorphism1 extends polymorphism2{
/*
 void msg() {
		System.out.println("hiiiiii");
	}
 */
}
public class Polymorphism {

	public static void main(String[] args) {
		
		polymorphism2 p2 = new polymorphism1(); //UPCASTING...
		p2.msg();
		//creating object of sub class and store it in super class.
	}

}
