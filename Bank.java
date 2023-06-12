package com.advanto.pack2;
import java.util.Scanner;
public class Bank {
                                      
	static void createAcc() {
		
		
		
	}
	static void existingAcc() {
		
	}
	static void editKyc() {
	
	}
	static void withdrawals() {
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Process\n 1. Create Account\n 2. Open Existing Account"
				+ "\n 3. Edit KYC \n 4. Withdrawals");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		switch(choice) {
		case 1 : createAcc();
		break;
		case 2 : existingAcc();
		break;
		case 3 : editKyc();
		break;
		case 4 : withdrawals();
		break;
		default : System.out.println("wrong choice");
		}
	}

}
