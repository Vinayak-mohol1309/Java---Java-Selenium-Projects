package com.advanto.pack1;

class ED2{
		int a=100;// access specifiers=default
		void test() {  // access specifiers=default
			System.out.println("test is completed");
		}
	//to hide the data , we have to make it private.
		private int bank_bakance=20000;
	//but if we have to access above variable then we have to create a method inside it's own class.
		int amt() { //GETTER method  ...read only
				return bank_bakance;
		}
		int set_amt(int rs) {  //SETTER method ......always has arguments.....write only....
			bank_bakance=rs;
			return bank_bakance;
		}
	
}
public class EncapsulationDemo { //packing data and function into single component and hiding it.
	
	public static void main(String[] args) {
		ED2 ed = new ED2();
		System.out.println(ed.a);// directly access.
		ed.test();  // directly access.
		//System.out.println(ed.bank_balance);       //it is private therefore we can not access it.
		int amount=ed.amt();  
		System.out.println(amount);
		//we access private variable of another class by the concept of ENCAPSULATION.
		amount=ed.set_amt(10000);
		System.out.println(amount);
	}

}
