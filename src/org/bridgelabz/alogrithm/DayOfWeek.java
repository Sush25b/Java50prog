

package org.bridgelabz.alogrithm;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class DayOfWeek 
{


	public static void main(String[] args) 
	{
		
		System.out.println("Enter a month between 1 to 12");
		int month = Utility.inputInteger();
		
		System.out.println("Enter the year which is valid ");
		int year = Utility.inputInteger();
		
		System.out.println("Enter the date between 1 to 31");
		int date = Utility.inputInteger();

		//method to get day
		Utility.calendar(date,month,year);
	}
}
