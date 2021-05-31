package com.firstfloor;

public class Meeting extends Office{

	public Meeting(){
		this(5678);
		
		System.out.println("default constructor");
		
	}
	
   public Meeting(int id){
	   this("karthi");
		
		System.out.println("argument based constructor :"+id);
		
	}
   
   public Meeting(String name){
	   
	   super("rajan");
	   
	   System.out.println("argument based constructor :"+name);
	   
   }
	
	
	public static void main(String[] args) {
		
		Meeting m = new Meeting();
		
	}
	
	
}
