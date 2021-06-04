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
<<<<<<< HEAD
	System.out.println("Reverse of a String  is : "+rs.reversestr(str));          
=======
	System.out.println("Reverse of a String  is : "+rs.reversestr(str));          //called method  
>>>>>>> d99a13da6248c052a2c8898491a815bce3f7fbbd
	}  
	//reverse string method  
	static String reversestr(String s)  
	{  
	String r="";  
<<<<<<< HEAD
	for(int i=s.length();i>0;--i)         
=======
	for(int i=s.length();i>0;--i)        //execute until condition i>0 becomes false  
>>>>>>> d99a13da6248c052a2c8898491a815bce3f7fbbd
	{  
	r=r+(s.charAt(i-1));   
	}  
	return r;  
	}  
}
