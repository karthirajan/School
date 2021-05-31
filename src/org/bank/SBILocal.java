package org.bank;

public class SBILocal extends SBI{

	@Override
	public void educationLoan() {
		
		System.out.println("education loan is 15%");
	}

	@Override
	public void jewelLoan() {
		
		System.out.println("jewel loan is 15%");
	}

	@Override
	public void bikeLoan() {
		System.out.println("bike loan is 15%");
		
	}
	
	public static void main(String[] args) {
		
		SBILocal s = new SBILocal();
		s.educationLoan();
		s.jewelLoan();
		s.bikeLoan();
		s.businessLoan();
		
	}

}
