/*********************************************************************************************************
 * @purpose : Read in N integers and counts the number of triples that sum to exactly 0.
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/

package org.bridgelabz.functionalprogram;

import org.bridgelabz.utility.Utility;

//A simple Java program to find three elements 
//whose sum is equal to zero 
public class SumOfThreeIsZero
{
	
	public static void main(String[] args) 
	{ 
	 //array of N nos 
	 int arr[] = {0, -1, 2, -3, 1}; 
	 
	 int n =arr.length; 
	 
	 //calling method to find Triplets
	 Utility.findTriplets(arr, n); 

	} 
}
/*
0 -1 1
2 -3 1
*/




