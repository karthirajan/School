package org.tester;

import java.util.Scanner;

public class Testtask {

		public static void main(String[] args) {
			
			Scanner s =new Scanner(System.in);
			System.out.println("enter the array size:");
			int a = s.nextInt();
			int n[]  =new int[a];
			int sum =0;
			int avg=0;
			
			System.out.println("enter the array values:");
			
			for(int i=0; i<a;i++) {
				
				n[i] =s.nextInt();
				sum = sum+n[i];
				avg=sum/a;
			}
			System.out.println(sum);
			System.out.println(avg);
			
			for(int i=0; i<a; i++) {
				System.out.print(n[i]+" ");
			}
	}
}

