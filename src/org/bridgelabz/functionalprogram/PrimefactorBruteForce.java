
/*********************************************************************************************************
 * @purpose : Computes the prime factorization of N using brute force.
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

public class PrimefactorBruteForce 
{   
	public static void main(String srgs[])
	{
		//taking input for which primefactor to to found
     	System.out.println("eneter nos to find its primefactor by brute froce:");
		long n=Utility.inputLong();
		
        System.out.print("\n"+"The prime factorization of " + n + " is: ");

        Utility.primeFactorBruteForce(n);
          
	}
}

/*
eneter nos to find its primefactor by brute froce:
28

The prime factorization of 28 is: 2 2 7

 */
