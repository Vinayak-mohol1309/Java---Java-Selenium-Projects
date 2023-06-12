package com.advanto.pack2;

import java.util.Scanner;

public class EvenOddArr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[6];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
					arr[i]=input.nextInt();
				}
		
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) {
					System.out.println("Even :- "+arr[i]);
				}else {
					System.out.println("Odd :- "+arr[i]);
				}
			}
	}

}
