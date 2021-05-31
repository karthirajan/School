package com.firstfloor;

public class Office {
	
	
	
	public Office() {
		this("rajan");
		System.out.println("parent class default constructor");
		
	}
	
	public Office(String name){
		
		System.out.println("parent class arg based constructor :"+name);
		
	}

}
