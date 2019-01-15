package org.bridgelabz.alogrithm;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class BinarySearch
{
	
		 public static void main(String args[])
		 {  
			 
		       int arr[] = {10,20,30,40,50}; 
		       for(int i=0;i<arr.length;i++)
		        {
		        	System.out.print(arr[i]+" ");
		        }
             
		     //i/p from user--- ele to be found 
		       System.out.println("\n"+"Enter the ele to find: ");  
		       int ele= Utility.inputInteger();
		       
		       System.out.println("ele no given is: "+ ele);
		       
		        int l=0;
		        int h=arr.length-1;
		        
		//started stopwatch
		     long start = System.currentTimeMillis();
		        	
		     	//Here we Call the BinarySearch Method
		        		int ans= Utility.binarySearch(arr,l,h,ele); 
		        
		        if(ans==1)
		        {
		        	System.out.println("The ele is found");
		        }
		        else
		        	System.out.println("The ele not found");
		        
		 
		//end stopwatch
		     long end = System.currentTimeMillis();
		        
		  //calculating the difference between------{the two nos enetered}
		        long time= (long) ((end - start) / 1000.0);
		       
		   //print the time
		        System.out.println("\n"+"the elapsed time performance:"+ time);
		 }  
}
/*
10 20 30 40 50 
Enter the ele to find: 
10
ele no given is: 10
The ele is found
the elapsed time performance:0
*/