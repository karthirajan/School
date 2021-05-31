package org.bank;

import java.util.Scanner;

public class ATM {
	
	public static ATM a;
	
	private ATM(){
		
	}
	
	public static ATM getInstance(){
		
		if(a == null){
			
			a = new ATM();
			
		}
		
		return a;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		ATM a = new ATM();
		System.out.println(a);
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Welcome");
		
		System.out.println("Enter your PIN");
		int i = s.nextInt();
		System.out.println("Your PIN number is :"+i);
		
		System.out.println("Enter your Name");
		String name = s.nextLine();
		System.out.println("Customer name is :"+name);
		
		System.out.println("Enter withdrawl amount");
		float amt = s.nextFloat();
		System.out.println("amount entered is :"+amt);
		
		System.out.println("Enter your phno");
		long phno = s.nextLong();
		System.out.println("phno is :"+phno);
		
		System.out.println("Would you like to continue another Transaction?");
		boolean b = s.nextBoolean();
		System.out.println(b);
		
		
	}

}
