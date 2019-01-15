package org.bridgelabz.alogrithm;

import org.bridgelabz.utility.Utility;

public class MergeSort 
{
	
  
    /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {53,20,97,27,38,10,65,50,34}; 
  
       //Unsorted ARRAY
        System.out.println("Given Array"); 
        printArray(arr); 
  
        //calling method & passing string to perform MERGE sort
        Utility.sort(arr, 0, arr.length-1); 
  
       //Sorted ARRAY
        System.out.println("\nSorted array"); 
        printArray(arr); 
    } 

}
