package com.secondfloor;

import org.bank.Access;

import com.firstfloor.NinthStandard;

public class EleventhStandard extends NinthStandard{
	
	
   public void user() {
	
	   System.out.println("new user");

   }
	
	
	public static void main(String[] args) {
		
		//multilevel inheritance
		EleventhStandard e = new EleventhStandard();
		e.user();
		e.karthi();
		e.chandruSundar();
		e.arunKumar();
	//	Access.method1();
		
		
	}

}
