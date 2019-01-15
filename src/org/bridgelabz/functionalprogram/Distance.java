/*********************************************************************************************************
 * @purpose :  to prints the Euclidean distance from the point (x, y) to the origin (0, 0). 
 * 				Theformulae to calculate distance = sqrt(x*x + y*y)
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

public class Distance 
{
		public static void main(String args[]) 
		{
			
		//taking input from user
			System.out.println("enter x1 point");
			double x1 = Utility.inputDouble();
			
			System.out.println("enter y1 point");
			double y1 = Utility.inputDouble();
			
			System.out.println("enter x2point");
			double x2 = Utility.inputDouble();
			
			System.out.println("enter y2 point");
			double y2 = Utility.inputDouble();
			
			//calling mathod to find Euclidean distance
			Utility.distance(x1 , y1,  x2,  y2);

		}
}
/*
enter x1 point
4
enter y1 point
4
enter x2point
2
enter y2 point
2
distance between the points:2.8284271247461903
*/