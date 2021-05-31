package org.bank;

import java.util.Scanner;

public final class Access {
	
	
	final  String username="karthi";
	final  String password="rajan";
	
	
	public final static void login() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("user enters username");
		String username = s.next();
		
		System.out.println("user enters password");
		String password = s.next();		

	}
	
	public void credentials() {
		
		
		
		System.out.println(username);
		System.out.println(password);

	}
	
	
	public static void main(String[] args) {
		
		Access a1 = new Access();
		
		//login();
		a1.credentials();
		
		
		
	}
	

}
