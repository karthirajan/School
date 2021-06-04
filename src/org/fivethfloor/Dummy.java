package org.fivethfloor;

<<<<<<< HEAD
import java.util.Scanner;

public class Dummy 
{
	public static void main(String args[] )  
    {  
       
        int balance = 100000, withdraw, deposit;  
  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
           
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
                      
     
        withdraw = sc.nextInt();  
                      
         
        if(balance >= withdraw)  
        {  
           
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {  
            
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
 
        deposit = sc.nextInt();  
                      
      
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
                case 3:  
   
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:  
   
        System.exit(0);  
            }  
        }
    }
}
=======
public class Dummy 
{
	public static void main(String[] args) 
	{ 
			  int i,fact=1;  
			  int number=5;
			  for(i=1;i<=number;i++){    
			      fact=fact*i;    
			  }    
			  System.out.println("Factorial of "+number+" is: "+fact);    
	}
	}
	
>>>>>>> d99a13da6248c052a2c8898491a815bce3f7fbbd
