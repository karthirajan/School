package org.String;

import java.util.Scanner;
public class StringMethods 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
//To find the length of the Given String 
	System.out.println("Enter the String to Check the Length : ");
	String s = sc.nextLine();
	int i = s.length();
	System.out.println("The Length of the Given String is:" +i +"\n");
	
	//To find Given String is Equals or Not
	System.out.println("Enter the String to check it is equal or not  " );
	String s1 = sc.nextLine();
	boolean b = s1.equals(s);
	System.out.println("The Given String is " +b +"\n" );
	
	
	//To find the Given String is Equals or Not without checking Case
	System.out.println("Checking String case ");
	String s2 = sc.nextLine();
	boolean b1 = s2.equalsIgnoreCase(s);
	System.out.println("The Given String is  " +b1 +"\n" );
	
	
	//To check the string contains given words
	System.out.println("Enter the word to check contains or not ");
	String s3 = sc.nextLine();
	boolean b2 = s.contains(s3);
	System.out.println("The String Contains "+b2 +"\n");
	
	
	//To split the given string 
	System.out.println("The splitted strings are : ");
	String[] r = s.split(" ");
	for (int j = 0; j < r.length; j++) 
	{
	System.out.println(r[j] +"\n");	
	}
	
	//To Trim the Entered string
	System.out.println("The trimmed strings are ");
    String s4="java trim             ";
	System.out.println(  s4.trim() + "trimmed" +"\n"); 
	
	 
	// To find the indexOf the Given String
	
	System.out.println("Enter the text to find the Index of given String");
	String s5 = sc.next();
	int i1 = s.indexOf(s5);
	int i2= s.lastIndexOf(s5);  //To find the Last indexOf Given String 
	System.out.println("The First Index Value is  "  +i1 +" Last Index value is " +i2 +"\n");
	
	
	//To change the lowercase in to uppercase
	String s6 = s.toUpperCase();
	System.out.println("THE UPPER CASES OF STRING IS  " +s6 +"\n");
	
	//To change the Uppercase in to Lowercase
	String s7 = s6.toLowerCase();
	System.out.println("the lower cases of above string is  "+s7 +"\n");
	
	//To check String Startwith given string
	System.out.println("Enter the text to check startwith above string " +"\n");
	String s9 = sc.next();
	Boolean s8 = s.startsWith(s9);
	System.out.println("Given String is Checked it is: " +s8 +"\n");
	
	//To check String endwith given string
	System.out.println("Enter the text to check endwith above string ");
	String s10 = sc.next();
	Boolean b10 = s.startsWith(s10);
	System.out.println("Given String is Checked it is: " + b10 +"\n");
	
	
	//To check the String character present in which index
	System.out.println("Enter the index value to check the character ");
	int in = sc.nextInt();
	char ch= s.charAt(in); 
	System.out.println("The Character present in index is: " +ch +"\n"); 

	
	// To find the substring of given String is
	System.out.println("Enter the from and to substrings you needed ");
	int i10 =sc.nextInt();
	int i11=sc.nextInt();
	String s11 = s.substring(i10, i11);
	System.out.println("The Substrings is " +"from " +" " +i10  +" " +"To" +" " +i11  +s11 +"\n");
	
	//To Replace given character in the given string
	System.out.println("Enter the Replaced character");
	String s14 =sc.next();
	String s15 =sc.next();
	String s12 = s.replace(s14, s15);
	System.out.println("The replaced string are  "+s12 +"\n");
	
	//To ReplaceAll Strings in given string
	System.out.println("Enter the Replaced String");
	String s16 =sc.next();
	String s17 =sc.next();
	String s13 = s.replaceAll(s16, s17);
	System.out.println("The ReplaceAll Strings are : "+s13 +"\n");
}
}
