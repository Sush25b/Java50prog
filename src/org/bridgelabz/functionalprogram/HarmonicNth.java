
/*********************************************************************************************************
 * @purpose : To find the value of nth Harmonic no
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

public class HarmonicNth
{
			
	public static void main(String srgs[])
	{

			//taking the nth Harmonic no from the user
				System.out.println("Enter the nth(last) no--to calculate harmonic series");
				int n=Utility.inputInteger();

				//calling the method to find harmonic value
				double sum= Utility.harmonicno(n);
				
				System.out.println("The value of nth Harmonic no is: "+ sum);
	}

}

/*
 * Question
 * 
 * Execution:    java HarmonicNumber n
 *  
 *  Prints the nth harmonic number: 1/1 + 1/2 + ... + 1/n.
 * 

eneter the N nos to find harmonic
10
H1 ---- 1.0
H2 ---- 1.5
H3 ---- 1.8333333333333333
H4 ---- 2.083333333333333
H5 ---- 2.283333333333333
H6 ---- 2.4499999999999997
H7 ---- 2.5928571428571425
H8 ---- 2.7178571428571425
H9 ---- 2.8289682539682537
H10 ---- 2.9289682539682538
*/