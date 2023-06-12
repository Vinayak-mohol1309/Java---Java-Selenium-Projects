package com.advanto.pack2;

abstract class Animal{
	
	//method speak(),eat() are compulsory but different with respect to other.
	//sleep() method is same for all that is why it is concrete method.
	
	abstract void speak();//abstract method don't have body.
	abstract void eat();//always non-static
	static void sleep() {//concrete method
		System.out.println("every animal sleep");
	}
}

class Dog extends Animal{//concrete class 
	void speak() {  //method overridden
		System.out.println("Bhowwww....");
	}
	void eat() {
		System.out.println("Dog pedigreee");
	}
}
class Cat extends Animal{
	void speak() {
		System.out.println("Meowwww....");
	}
	void eat() {
		System.out.println("Cat pedigreee");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.sleep();
		d1.eat();
		d1.speak();
	}

}
