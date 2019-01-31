
/*********************************************************************************************************
 * @purpose : to pprint 2D Calendar that of the month and year  . Store the Calendar in an 2D Array, 
 * 				the first dimension the week of the month and the second dimension stores the day of the week.
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 14-01-2019
 *
 ********************************************************************************************************/
package org.bridgelabz.datastructure;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class Calendar
{
	//to display dates of months by { 1 to 30,31} 
	static int n=1;
   
	public static void main(String[] args) 
	{
		try
		{
			//input valid month
			System.out.println("Enter a month between 1 to 12");
			int month = 1;
			
			//input valid year
			System.out.println("Enter the year which is valid ");
			int year = 2019;
			
			//input valid date
			System.out.println("Enter the date between 1 to 31");
			int date = 1;
			
		//method to find DAY---for which the inputs are given By USER
		int count= Utility.calendar2(date,month,year);
		
		//Days of week a ARRAY is Char created 
		char c[]= {'s','m','t','w','t','f','s'};
		
		
			//display the DAYS 
			for(int i=0;i<c.length;i++)
			{
				System.out.print(c[i]+"  ");
			}
		
			
		System.out.println("\n");
		
		//int Array to display Calendar in 2D format
		int arr[][]=new int[5][7];

		
		//int Array to check and take END date---Of the give input month
		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		
		//condition for checking year is a leap year are not
			///if Leap year change the END date of--->Feburary Month in the days[]
		if( year%4==0 && year%100!= 0  ||  year%400==0)
		{
			days[1] = 29;
		}
	
		
			/**
			 * For loop the DISPLAY the Calendar in 2D format
			 */
			for(int i=0;i<=5;i++) //Weeks
			{
				for(int j=0;j<=6;j++) //days
				{ 
					//count--->is the DAY  for which the inputs are given By USER
					if(i==0 && j<count) 
					{
						System.out.print(" "+"  ");
					}
					
					if(i==0 && j>=count )
					{
						System.out.print(n+"  ");
						n++;
					}
					
					if(i==1)
					{ 
							System.out.print(n+"  ");
							n++;
					}
					if(i>=2 && n<= days[month-1])
					{
						System.out.print(n+" ");
						n++;
					}
					
				 }
			     System.out.println();
			  }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
/*

if(i!=0 && n!=31)
{
	System.out.print(n+" ");
	n++;
}

int exchange =1;

if(i==0 && exchange==1 && space)
{
		System.out.print("a"+" ");
		space++;
}


for(int k=0;k<=6;k++) //week
{
	if(i==0 )
	{
	    System.out.print(arr[i][j]=n );
	    System.out.print("b");
	}
	
}*/

