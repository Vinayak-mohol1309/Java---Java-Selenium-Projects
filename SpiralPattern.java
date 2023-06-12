package com.advanto.pack2;

import java.util.Scanner;

public class SpiralPattern {
	public static void printPattern(int n) {
		int size = 2 * n-1;//size=10
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=size;j++) {
				System.out.print(Math.max(Math.abs(i - n), Math.abs(j - n)) + 1 + " "); 
				
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number:- ");//num=6
		int num = input.nextInt();
		printPattern(num);
	}

}
