package com.advanto.pack1;

class Animal{
	void speak() {
		System.out.println("Animals Speaking");
	} 
	
}

class Mammal extends Animal{
/*
	void speak() {
		System.out.println("Animals Speaking"); //inherited part
	}
*/
	void speak() {
		System.out.println("Mammals Speaking");
	}
}

class Dog extends Mammal{
/*
	void speak() {
		System.out.println("Animals Speaking"); //inherited part
	}
												
	void speak() {
		System.out.println("Mammals Speaking"); //inherited part
	}
*/
	void speak() {
		System.out.println("Bhowww....Bhowwww...");
	}
}

class Cat extends Mammal{
/*
	void speak() {
		System.out.println("Animals Speaking"); //inherited part
	}
												
	void speak() {
		System.out.println("Mammals Speaking"); //inherited part
	}
*/
	void speak() {
		System.out.println("Meowww...Meowww...");
	}
}

class Tiger extends Mammal{
/*
	void speak() {
		System.out.println("Animals Speaking"); //inherited part
	}
												
	void speak() {
		System.out.println("Mammals Speaking"); //inherited part
	}
*/
	void speak() {
		System.out.println("Tiger Roaring....");
	}
}


public class MultiLevelMethod {  //in Multilevel methods we see method overriding is occurred.

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		a1.speak();
		Mammal m1 = new Mammal();
		m1.speak();
		Dog d1 = new Dog();
		d1.speak();
		Tiger t1 = new Tiger();
		t1.speak();
		Cat c1 = new Cat();
		c1.speak();
		
	}

}
