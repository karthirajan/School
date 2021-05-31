package com.secondfloor;

import org.bank.ATM;

public class TwelthStandard {
	
	public void tester1() {
		
		System.out.println("Global Level Access");
		System.out.println("Inside the package we can access by creating obj/extends");
		System.out.println("Outside the package we can access by creating obj/extends");

	}
	
	
    protected void tester2() {
		
    	System.out.println("Global Level Access but having some restriction");
		System.out.println("Inside the package we can access by creating obj/extends");
		System.out.println("Outside the package we can access by creating extends");
		
	}
    
    void tester3() {
		
    	System.out.println("Package Level Access");
		System.out.println("Inside the package we can access by creating obj/extends");

	}
    
    private void tester4() {
		
    	System.out.println("Class Level Access");

	}
	
	
	
	
	public static void main(String[] args) {
		
		TwelthStandard t = new TwelthStandard();
		t.tester4();
		
		ATM a = ATM.getInstance();
		System.out.println(a);
		
		
		
		
	}

}
