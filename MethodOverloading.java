package com.advanto.pack1;
import java.util.Scanner;

class MethodOverloading2{ 
	void add(int a , int b) {  //two parameters
		int c = a+b;
		System.out.println(c);
	}
	void add(int a , int b , int c) {  //three parameters
		 c = a+b;
		System.out.println(c);
	}
	
}
public class MethodOverloading {  //possible with same method name but different method signature. 

	void add(int a , int b) {  //two parameters
		int c = a+b;
		System.out.println(c);
	}
	void add(int a , int b , int c) {  //three parameters
		 c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		MethodOverloading mo1 = new MethodOverloading();
		
		mo1.add(10, 30); //this will call add() having two parameters
		mo1.add(10, 20 , 0);  //this will call add() having three parameters
		MethodOverloading2 mo2 = new MethodOverloading2();
		mo2.add(12, 45); //this will call add() having two parameters
		mo2.add(10, 20 , 0);  //this will call add() having three parameters
	}

}
