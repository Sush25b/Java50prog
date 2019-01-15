package org.bridgelabz.alogrithm;

import javax.swing.text.Utilities;

import org.bridgelabz.utility.Utility;

public class TemperatureConversion 
{
	public static void main(String args[]) 
	{
		//user i/p temp---in celsius
		System.out.println("Enter the temperature in celsius");
		double celsius = Utility.inputDouble();
		
		////user i/p temp---in fahrenheit
		System.out.println("Enter the temperature in fahrenheit ");
		double fahrenheit = Utility.inputDouble();
		
		//calling method for conversion
		Utility.celsiusfahrenheit(celsius, fahrenheit);
	}
}


