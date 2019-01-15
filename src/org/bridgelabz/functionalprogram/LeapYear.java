/*********************************************************************************************************
 * @purpose : to check year enetered is Leap yr or not
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/

package org.bridgelabz.functionalprogram;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		//taking input from user
		System.out.println("Enter the year to check it is Leap yr or not");
		int year = sc.nextInt();
		
		/**
		 * check the yr enter is proper or not
		 */
		if(year>0)
		{	
				Utility.checkLeapyear(year);
		}
		else
		{
			System.out.println("give proper input");
		}
	}
}
/*
Enter the year to check it is Leap yr or not
2100
This is not a Leap Year
*/
