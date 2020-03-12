package com.epsilon.training.assignment;

import java.util.Scanner;

public class assignment3 {

	public static void main(String args[]) {
		int num;
		for(int i=0;i<5;i++)
		{
			System.out.println("enter the number:");
		Scanner s= new Scanner(System.in);
		num=s.nextInt();
			System.out.println("the entered number is a prime ? "+ isPrimeNumber(num));
		}
	}
	static boolean isPrimeNumber(int num) { 
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
		return true;
	}
	
}
