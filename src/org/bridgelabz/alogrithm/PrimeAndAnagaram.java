
/*********************************************************************************************************
 * @purpose : to find the prime numbers that are Anagram and Palindrome 
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

public class PrimeAndAnagaram 
{
	 public static void main(String[] args) 
	   {   
	       //take 
	       System.out.print("Enter the first number : ");  
	       int start = Utility.inputInteger(); 
	       
	       System.out.print("Enter the second number : ");  
	       int end = Utility.inputInteger(); 
	       
	       System.out.println("List of prime numbers between " + start + " and " + end);  
	       
		   Utility.primeAndAngaram(start, end);
	   }
}
