package com.epsilon.training.assignment;

import java.util.Scanner;

public class assignment2 {

	public static void main(String args[]) {
		int year, month, day;
		for(int i=0;i<10;i++)
		{
			System.out.println("enter the date:");
		Scanner s= new Scanner(System.in);
		year=s.nextInt();
		month=s.nextInt();
		day=s.nextInt();
			System.out.println("the entered date is valid ? "+isValidDate(year,month,day));
		}
	}
	
	static boolean isValidDate(int year, int month, int day) { 
		if(month < 1 || month >12 || day< 1 || day>31)
			return false;
		if(year% 4==0 && month==2)
		{
			if(day>29 )return false;
			else return true;
		}
		else if(year% 4 !=0 && month==2)
		{
			if(day <28 )return true;
			else return false;
		}
		else if(month==8 || month ==7)
		{
			if(day>=1 && day <=31)
				return true;
		}
		else if( month ==4 || month ==6 || month ==9 || month==11)
		{
			if(day>31)return false;
			else return true;
		}
		else if(month ==1 || month ==3 || month ==5 || month ==10|| month==12)
		{
			if(day<=31)return true;
			else return false;
		}
	return false;
	}
	
}
	
