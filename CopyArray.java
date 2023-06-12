package com.advanto.pack2;
import java.util.Iterator;
import java.util.Scanner;
public class CopyArray {

	public static void main(String[] args) {
		Object obj[] = new Object[5];
		obj[0]=new CopyArray();
		obj[1]=null;
		obj[2]=1234;
		obj[3]=new CopyArray();
		obj[4]="prerana";
//		System.out.println("Enter the array items.");//from user accept
//		Scanner input = new Scanner(System.in);
//		for(int i=0;i<5;i++) {
//			obj[i] = input.next();
//		}
//		for(int i=0;i<5;i++) {   //display array
//			System.out.println(obj[i]);
//		}
		Object obj1[] = new Object[obj.length];
		for(int i=0;i<obj1.length;i++) {
			obj1[i] = obj[i];
		}
		for(int i=0;i<obj1.length;i++) {   //display array
			System.out.println(obj[i]);
		}
		
	}

}
