package com.advanto.pack2;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(true) {
			System.out.println(i++);//post increment = 1st use then increment.
			if(i==100) {
				break;
			}
		}
	}

}
