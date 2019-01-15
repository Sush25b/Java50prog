/*********************************************************************************************************
 * @purpose : A table of the powers of 2 that are less than or equal to 2^N.
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

public class PowerOf2 
{
		public static void main(String srgs[])
		{
			//taking the n nos till which we want to print the power2 table
			System.out.println("eneter the N nos to print table");
			int n= Utility.inputInteger();
			
			//to print table
			Utility.powerof2(n);
		}
}
/*
eneter the N nos to print table
3
2^ 1 =2
2^ 2 =4
2^ 3 =6
*/