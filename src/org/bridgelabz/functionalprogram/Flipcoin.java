/*********************************************************************************************************
 * @purpose : Flip Coin and print percentage of Heads and Tails
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

public class Flipcoin 
{
	public static void main(String[] args) 
	{
		
		//to take i/p of nos of coin the coin should be Tossed
		System.out.println("Enter the totalno of times---you want the coin to be tossed");
		int totalno= Utility.inputInteger();
	
		//calling metho to find wins percentage
        Utility.flipcoin(totalno);
	}
}

/*
 Enter the totalno of times you want the coint to be tossed
7
0.03886444551667867
0.6981876976267346
0.6371929767780214
0.4940923549988645
0.31803553937007856
0.21925457701728068
0.656976763138935
The number of head is4
The number of tails us3
The percentage of head is57
The percentage of tail is42
*/
