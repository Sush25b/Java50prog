package org.bridgelabz.alogrithm;

import org.bridgelabz.utility.Utility;

public class BubbleSortString 
{

	// Driver method 
    public static void main(String args[]) 
    {         
        String arr[] = {"ussh","ball","fat","zero","balls"};
  
        System.out.println("given string is: ussh,ball,fat,zero,balls");
        
        //started stopwatch
	     long start = System.currentTimeMillis();
	     			
	     			//PRE CONDITION initially the array must be SORTED---so here we SORT the Array
	     					Utility.bubbleStringSort(arr);
	    
	    //end stopwatch
	     long end = System.currentTimeMillis();
	     				        
	    //calculating the difference between------{the two nos enetered}
	     long time= (long) ((end - start) / 1000.0);
	     				       
	     //print the time
	     System.out.println("\n"+"the elapsed time performance:"+ time);
          
    } 
}
