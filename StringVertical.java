package com.advanto.pack2;
import java.util.Scanner;
public class StringVertical {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the string:- ");
	String str = input.next();
	char[] ch = str.toCharArray();
	for(char c:ch) {
		System.out.println(c);
	}
	}

}
