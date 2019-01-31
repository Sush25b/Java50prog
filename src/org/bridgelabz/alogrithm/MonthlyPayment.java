
/*********************************************************************************************************
 * @purpose : to calculate monthlyPayment and calculates the monthly payments you would 
 * 				have to make over Y years to pay off a P principal loan amount at R per cent interest compounded monthly.
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/
package org.bridgelabz.alogrithm;

import org.bridgelabz.utility.Utility;

public class MonthlyPayment 
{
	public static void main(String[] args)
	{
		System.out.println("Enter PRINCIPLE LOAN amount");
		double P = Utility.inputDouble();
		
		System.out.println("Enter YEAR to pay off ");
		double Y = Utility.inputDouble();
		
		System.out.println("Enter Percent Interest Compounded monthly");
		double R = Utility.inputDouble();
		
		//calling the method---to calculate monthly payment
		double payment= Utility.monthpayment(P, Y, R);
		
		//print payment
		System.out.println("payment is: "+payment);
		
	}
}
