package com.advanto.pack1;


abstract class Ab{
	 void print() {
		System.out.println("this is abstract class method");
	}
}

public class AbstractionDemo extends  Ab{
	 void display() {
		System.out.println("this is display method");
	}
	public static void main(String[] args) {
		//Ab a1 = new Ab();
		AbstractionDemo ab1 = new AbstractionDemo();
		ab1.print();//we can call abstract class method by using inheritance . call it from sub class .
		ab1.display();
	}

}
