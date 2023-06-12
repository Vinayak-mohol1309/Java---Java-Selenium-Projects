package com.advanto.pack1;

interface Ios{
	void print();//all method in interface are abstract by default.
	int i=10;
	static void test() { //static concrete method are allowed in interface
	//method body
	}
}
interface Windows extends Ios{
	void Run();
}
class Android implements Ios{ //A class can implements interfaces
	public void print() { //we have to use "public"
		System.out.println("this is implemented abstract method");
	}
}
class Os implements Windows{
	public void print() {
		System.out.println("it is a Os class,print() method");
	}
	public void Run() {
		System.out.println("this is Run method");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Android a1 = new Android();
		a1.print();
		System.out.println(a1.i);
		Os os1 = new Os();
		os1.print();
		os1.Run();
		System.out.println(os1.i);
	}

}
