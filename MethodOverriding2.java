package com.advanto.pack1;


//method overriding is not possible in same class because we can not create multiple methods with same name. 
class 	MethodOverriding {

	void add() {  //created method
		System.out.println(" parent class");
	}
	
}

public class MethodOverriding2 extends MethodOverriding{  
	//possible with same method name and same method signature and same return type but in different class. 

/*	void add() {  //inherited method
	
	System.out.println("parent class");
}
	
*/ 
	void add() {  //created method
		System.out.println(" child class");
	}
	
	
	
	public static void main(String[] args) {
		
		
		MethodOverriding mo1 = new MethodOverriding();
		
		mo1.add(); //this will call add() having two parameters
		MethodOverriding2 mo2 = new MethodOverriding2();
		mo2.add(); //this will call add() having two parameters
		
		
	}

}


