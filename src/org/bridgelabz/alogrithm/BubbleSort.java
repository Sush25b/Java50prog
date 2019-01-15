
package org.bridgelabz.alogrithm;

import org.bridgelabz.utility.Utility;

public class BubbleSort 
{
	
	// Driver method 
    public static void main(String args[]) 
    {         
        int arr[] = {48,37,10,94,23}; //intager array taken
  
        System.out.println("given string is:  {48,37,10,94,23};  ");   
        
      //started stopwatch
	     long start = System.currentTimeMillis();
        
	     		//PRE CONDITION initially the array must be SORTED---so here we SORT the Array
	     			Utility.bubblesort(arr);
        
      //end stopwatch
	     long end = System.currentTimeMillis();
	        
	  //calculating the difference between------{the two nos enetered}
	        long time= (long) ((end - start) / 1000.0);
	       
	   //print the time
	        System.out.println("\n"+"the elapsed time performance:"+ time);
	        
    } 
}
