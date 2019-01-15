
/*********************************************************************************************************
 * @purpose : to check how many random numbers do you need to generate distinct coupon number
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

public class Coupon
{
	public static void main(String srgs[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to collect nos of Distict coupon");
		int n=sc.nextInt();
		
		//calling method...to get Distinct coupon
		Utility.collect(n);
	}
}
