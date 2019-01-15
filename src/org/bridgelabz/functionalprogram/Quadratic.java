/*********************************************************************************************************
 * @purpose : to find the roots of the equation a*x*x + b*x + c. 
 * 				hence there are 2 roots. can be found using a formula delta = b*b - 4*a*c
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

public class Quadratic
{
	public static void main(String[] args)
	{
		//taking 3 variables
		int a, b, c;
		
		System.out.println("Given quadratic equation:ax^2 + bx + c");
		
		System.out.print("Enter a:");
		a = Utility.inputInteger();
		
		System.out.print("Enter b:");
		b = Utility.inputInteger();
		
		System.out.print("Enter c:");
		c = Utility.inputInteger();
		
		System.out.println("Given quadratic equation:" + a + "x^2 + " + b + "x + " + c);
		
		//calling the method to Find the roots
		Utility.rootsofQuadratic(a, b, c);
	}
}
/*
Given quadratic equation:ax^2 + bx + c
Enter a4
Enter b8
Enter c1
Given quadratic equation:4x^2 + 8x + 1
Roots of the equation are real and unequal
First root is:-0.1339745962155614
Second root is:-1.8660254037844386
*/
