
/*********************************************************************************************************
 * @purpose : range of 0 - 1000 Numbers and find the Prime numbers in that range. 
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/

package org.bridgelabz.alogrithm;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;  

public class PrimeNos
{
	
	   public static void main(String[] args) 
	   { 	       
	       System.out.print("Enter the first number : ");  
	       int start = Utility.inputInteger(); 
	       
	       System.out.print("Enter the second number : ");  
	       int end = Utility.inputInteger(); 
	       
	       System.out.println("List of prime numbers between " + start + " and " + end);  
	       
	       //calling method to find prime nos
		   Utility.primenos(start, end);
	   }
	   
}
