package org.bridgelabz.alogrithm;
import java.util.Arrays;

import org.bridgelabz.utility.Utility;

public class BinarySearchString
{
	    public static void main(String[] args) 
	    {

	        String array[]={"EWRSFSFSFSB","BB","AA","SDFSFJ","WRTG","FF","ERF","FED","TGH"};
	        
	        String ele = "BB";   //--- ele to be found 

	        Arrays.sort(array); ///to sort the String array

	        System.out.println("given array is: EWRSFSFSFSB, BB, AA, SDFSFJ, WRTG, FF ,ERF, FED, TGH ");
		    System.out.println("ele no given is: "+ ele);
		  
	     //started stopwatch
		     long start = System.currentTimeMillis();
	        
		     	//Here we Call the BinarySearch Method
		         int ans= Utility.binaryStringSearch(array,ele);
		        
		        if(ans==1)
		        {
		        	System.out.println("The String ele is found ");
		        }
		        else
		        	System.out.println("The ele not found ");
		        
		  //end stopwatch
			  long end = System.currentTimeMillis();
			        
		  //calculating the difference between------{the two nos enetered}
			  long time= (long) ((end - start) / 1000.0);
			       
		//print the time
			   System.out.println("\n"+"the elapsed time performance:"+ time);
			 
	   }  
}
