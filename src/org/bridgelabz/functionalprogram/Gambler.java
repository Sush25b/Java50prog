/*********************************************************************************************************
 * @purpose : a gambler with $stake and place fair he/she goes broke or reach $goal.o/p wins and the number of bets he/she makes.
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/

package org.bridgelabz.functionalprogram;

import java.util.Random;
import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class Gambler 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		
		int goal = 30;				// gambler's goal

		int amount =10;				//INITIAL amount
		
		//taking input---nos of time to be played
        System.out.println("enter the nos of times the to play");
        int n=sc.nextInt();
        
        //calling gambler method to find wins percentage
        Utility.gambler(goal ,amount ,n);
	}
}




/*
public class Gambler { 

	    public static void main(String[] args) {
	        int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
	        int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
	        int trials = Integer.parseInt(args[2]);    // number of trials to perform

	        int bets = 0;        // total number of bets made
	        int wins = 0;        // total number of games won

	        // repeat trials times
	        for (int t = 0; t < trials; t++) {

	            // do one gambler's ruin simulation
	            int cash = stake;
	            while (cash > 0 && cash < goal) {
	                bets++;
	                if (Math.random() < 0.5) cash++;     // win $1
	                else                     cash--;     // lose $1
	            }
	            if (cash == goal) wins++;                // did gambler go achieve desired goal?
	        }

	        // print results
	        System.out.println(wins + " wins of " + trials);
	        System.out.println("Percent of games won = " + 100.0 * wins / trials);
	        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
	    }

	}
*/

//---------------------my output--------------------
/*
 eneter a no t bet 1 to 6
 
1
1
eneter a no t bet 1 to 6
1
2
eneter a no t bet 1 to 6
1
3
wins games won = 100
*/



