package com.firstfloor;

public class Employee extends EigthStandard{
	
	
	@Override
	public void chandruSundar() {
		
		System.out.println("Hi this is chandru sundar");
		super.chandruSundar();
		
		
	}
	
	
	public void empDetails() {
		
		System.out.println("Employee Details");

	}
	
    public void empDetails(int ID) {
		
		System.out.println("Employee ID is :"+ID);

	}
    
    public void empDetails(String name) {
		
		System.out.println("Employee name is :"+name);

	}
    
    public void empDetails(String mail, long phno) {
		
		System.out.println("Employee mail id is :"+mail);
		System.out.println("Employee phno is :"+phno);

	}
    
    public void empDetails(int doorNo,String address) {
		
		System.out.println("Employee address is :"+doorNo+" "+address);

	}
    
    public static void main(String[] args) {
    	
    	Employee e = new Employee();
    	e.empDetails();
    	e.empDetails(78655);
    	e.empDetails("karthi");
    	e.empDetails(151, "Chennai");
    	e.empDetails("karthi@gmail.com", 46524324556l);
		
    	
    	e.chandruSundar();
	}

}
