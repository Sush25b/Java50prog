
/*********************************************************************************************************
 * @purpose : function sqrt  to compute the square root of a nonnegative number c given in the input using Newton's method:
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/	



/**
	 *  Computes the square root of a nonnegative number c using
	 *  http://en.wikipedia.org/wiki/Newton's_method
	 *  Newton's method:
	 *     - initialize t = c
	 *     - replace t with the average of c/t and t
	 *     - repeat until desired accuracy reached
	 *
	 * Output
	 *  1.414213562373095
	 */
        
package org.bridgelabz.alogrithm;

import java.util.Scanner;
import org.bridgelabz.utility.Utility;

public class SqrtNewtonMethod
{
	    
	    public static void main(String[] args) 
	    {
	    	System.out.println("Enter a non negative integer to find Sqrt");
	    	double c = Utility.inputDouble();

	    	double sqrt= Utility.sqrtNewtonMethod(c);
	  
	        // print out the estimate of the square root of c
	        System.out.println("the Sqrt netwon method value is: " +sqrt);
	    }
}

/* 
Enter the 1st String:
51
the Sqrt netwon method value is: 7.141428428542853
*/