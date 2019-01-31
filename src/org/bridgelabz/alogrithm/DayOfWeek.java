
/*********************************************************************************************************
 * @purpose :function that takes a date as input and prints the day of the week  
 * 					Use the following formulas, for the Gregorian calendar
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 10-01-2019
 *
 *********************************************************************************************************/

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
