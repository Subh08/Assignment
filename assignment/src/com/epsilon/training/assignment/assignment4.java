package com.epsilon.training.assignment;

import java.util.Scanner;

public class assignment4 {
	public static void sortThreeNumbers(int a, int b, int c) { 
		if (b<c)
		{
			if(a<b)
			System.out.println(a+" <"+b+" <"+c);
			else if(a<c)
			System.out.println(b+" <"+a+" <"+c);
			else System.out.println(b+" <"+c+" <"+a);
			}
		
		else if{
			if(a>b)System.out.println(c+" <"+b+" <"+a);
			else if(a<c)System.out.println(a+" <"+c+" <"+b);
			else System.out.println(c+" <"+a+" <"+b);
		}
		
	}
	public static void main(String args[]) {
		int a,b,c;
			System.out.println("enter the numbers:");
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
			sortThreeNumbers(a,b,c);
		}
	}
	
