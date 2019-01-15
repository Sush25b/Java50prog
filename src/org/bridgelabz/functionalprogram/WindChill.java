/*********************************************************************************************************
 * @purpose : program WindChill..to check the effective temperature defined by National Weather (the wind chill)
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

public class WindChill
{
	public static void main(String args[])
	{
		
		System.out.println("Enter the temperature--- greater than 50");
		int temp = Utility.inputInteger();
		
		
		System.out.println("Enter the wind speed--- between 3 and 120");
		int speed = Utility.inputInteger();
		
		//calling the method to find Weather windchill
		Utility.WeatherService(temp, speed);

	}
}
