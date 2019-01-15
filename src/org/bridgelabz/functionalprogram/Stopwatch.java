/*********************************************************************************************************
 * @purpose : Program for measuring the time that elapses between the start and end 
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

public class Stopwatch
{
	    public static void main(String[] args) 
	    {	
	    	//taken  long..as the times---return in  milliseconds
			long t=Utility.stopwatch(); 
			
			System.out.println("so the time seconds between two nos enetered is: "+ t);
	    } 
}
/*
Enter the number to start----stopwatch
1
Enter the number to start----stopwatch
2
so the time between two nos enetered is: 12
*/