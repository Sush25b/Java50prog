
/*********************************************************************************************************
 * @purpose : to print calendar in 2D format, the Week Object having a list of WeekDay .
 * 				 The WeekDay objects are stored in a Queue implemented using Linked List.
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 14-01-2019
 *
 *********************************************************************************************************/

package org.bridgelabz.datastructure;

import org.bridgelabz.utility.Utility;

public class CalendarQueue 
{
	static int n=1,counter=0,space=0;

	public static void main(String[] args) 
	{
		//creating main object for Queue using linkedlist class  
		QueueUsingLinkedListObjecttype mainqueue= new QueueUsingLinkedListObjecttype();
		
		//creating sub  object for Queue using linkedlist class to store week days  
		QueueUsingLinkedListObjecttype qll= new QueueUsingLinkedListObjecttype();
		
				//input valid month
				System.out.println("Enter a month between 1 to 12");
				int month = Utility.inputInteger();
				
				//input valid year
				System.out.println("Enter the year which is valid ");
				int year =  Utility.inputInteger();
				
				//input valid date
				System.out.println("Enter the date between 1 to 31");
				int date =  Utility.inputInteger();

		
		//method to find DAY---for which the inputs are given By USEr
		int count= Utility.calendar2(date,month,year);
		
		//Days of week a ARRAY is Char created 
		char c[]= {'s','m','t','w','t','f','s'};
		
		
			//display the DAYS 
			for(int i=0;i<c.length;i++)
			{
				System.out.print(c[i]+"\t");
			}
		
		
		System.out.println("\n");

		int[] days = { 30, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		// condition for checking year is a leap year are not
		if( year%4==0 && year%100!= 0   ||   year%400==0)
		{
			days[1] = 29;
		}
		
		/*this for is to store days to sub queues and storing sub queues in main queue*/
		for (int i = 1; i <= days[month-1]; i++) 
		{  
			qll.insertAtEnd(i);//calling insert method to insert elements in SUBQUEUE
			
				//condition to create new sub queue
				if ((i + count) % 7 == 0 || i==days[month-1] ) 
				{
					mainqueue.insertAtEnd(qll);// inserting subqueue to main queue 
					
					qll=new QueueUsingLinkedListObjecttype(); // creating new sub queue
	            }
		}
		
		/*for to print space where there is no day falls*/
		for (int i=0;i<count;i++)
		{
			System.out.print("\t");
		}
		
		/*for loop to print all subqueues in main queue*/
		for (int i=0 ;i<mainqueue.size();i++)
		{
			//removing top queue from main queue and coping it to variable
			QueueUsingLinkedListObjecttype week=(QueueUsingLinkedListObjecttype) mainqueue.pop();
			
				//for loop to print ekements in sub queue
				for (int j=0;j<week.size();j++)
				{
					//printing sub object elements
					System.out.print(week.pop()+"\t");
				}
				System.out.println();
				//System.out.println((Object)mainqueue.pop());
			
		}
	}

}
	
				
