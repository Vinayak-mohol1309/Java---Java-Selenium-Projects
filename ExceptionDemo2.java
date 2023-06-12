package com.advanto.pack2;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo2 e1 = new ExceptionDemo2();
		e1.test1();
	}
	void test1() {
		test2();
	}
	void test2() {
		test3();
	}
	void test3() {
		int n = 10/0;//ArithmaticException
	}

}
