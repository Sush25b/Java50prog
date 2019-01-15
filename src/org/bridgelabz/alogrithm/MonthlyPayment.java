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
