package org.bridgelabz.alogrithm;

import org.bridgelabz.utility.Utility;

public class VendingMachine
{
	
	public static void main(String args[]) 
		{	
			System.out.println("Enter the amount ");
			
			//user input amount---for which change..he want
			int amount = Utility.inputInteger();
		
		//TO COUNT THE nos of notes ----by the give array only
		int[] notes= {1000,500,100,50,10,5,2,1};

		//calling the method to get change
		Utility.vendingMachine(notes, amount);
		
	}
}



/*Another mEthod 2
 * 
		int count = 0;			 //-----TO COUNT THE nos of notes 
		int count1000 = 0;
		int count500 = 0;
		int count100 = 0;
		int count50 = 0;
		int count10 = 0;
		int count5 = 0;
		int count2 = 0;
		int count1 = 0;
		if (amount > 0) {

			while (amount >= 1000) {
				count++;
				count1000++;
				amount = amount - 1000;

			}
			while (amount >= 500) {
				count500++;
				count++;
				amount = amount - 500;
 */
