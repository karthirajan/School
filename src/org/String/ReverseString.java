package org.String;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] arg)  
	{  
	ReverseString rs=new ReverseString();  
	Scanner sc=new Scanner(System.in);  
	System.out.print("Enter a string: ");  
	String  str=sc.nextLine();    
	System.out.println("Reverse of a String  is : "+rs.reversestr(str));          //called method  
	}  
	//reverse string method  
	static String reversestr(String s)  
	{  
	String r="";  
	for(int i=s.length();i>0;--i)        //execute until condition i>0 becomes false  
	{  
	r=r+(s.charAt(i-1));   
	}  
	return r;  
	}  
}
