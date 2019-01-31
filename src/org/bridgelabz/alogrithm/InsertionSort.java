
/*********************************************************************************************************
 * @purpose : Utility Class having following static methods insertionsort method for integer
 * 				 &  Check using Stopwatch the Elapsed Time for every method call
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/

package org.bridgelabz.alogrithm;

import org.bridgelabz.utility.Utility;

public class InsertionSort 
{
	    // Driver method 
	    public static void main(String args[]) 
	    {         
	        int arr[] = {12, 4, 1, 5, 6};    
	        
	        System.out.println("the nos are as follows:");
	        
	        //to print arr elements
	        for(int i=0;i<arr.length;i++)
	        {
	        	System.out.print(arr[i]+" ");
	        }
	        
	        //started stopwatch
		     long start = System.currentTimeMillis();
	        
	       
		      //calling insertion method---to insert the no at right position
		        Utility.insertionsort(arr);
		        
	        //end stopwatch
		     long end = System.currentTimeMillis();
				        
		  //calculating the difference between------{the two nos enetered}
		     long time= (long) (end - start) ;
				        
		   //print the time
		        System.out.println("\n"+"the elapsed time performance in milliseconds:"+ time);
				        
	          
	    } 

}
