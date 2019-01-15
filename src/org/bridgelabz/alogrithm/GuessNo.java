package org.bridgelabz.alogrithm;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class GuessNo
{
	
//NOTE: HERE we dont do--Search in Array elements
	    //HERE we take ARRAY index---as the range
	         //& perform---operation on THe ARRAy index Range ONLY ,Not on ARRAY ELEMENTS
	 				//2^3 = 8 , so my range is(o to 7)-----i.e my ARRAY INDEX
	                       //Dont take array element--THE total ARRAY is empty
	 
	 public static void main(String args[])
	 {  
		
	    	System.out.println("Enter the nth nos for the range of 2^n");
	    	int n= Utility.inputInteger();
	    	
	    	double range=Math.pow(2.0,n);
	    	
	    //to make int array---of 2^n range ok
	        int arr[]=new int[ (int)range ];    //2^3= 8 array
	        
	        int l=0;    ///start index of array
	        
	        int h=arr.length-1;   ///end index of array
	        
	     System.out.println("So the nos  of 2^n RANGE is :");
	        
	     	//loop to print elements  
	        for(int i=0;i<arr.length;i++)
	        {
	        	System.out.print(i +" ");
	        }
	        
	        //call method to guess no BY----USING BINARY SEARCH
	        		int ans= Utility.guessBinarySearch(arr,l,h); 

	        if(ans==1)
	        {
	        	System.out.println("The ele is found");
	        }
	        else
	        	System.out.println("The ele not found");
	 }  
}

/* OUtput-
 Enter the Nth nos for the range
10
So the nos RANGE is :
0 1 2 3 4 5 6 7 8 9 
so the mid ele is :4

User--plz choose proper option
1) Correct no gussed
2) no is less
3) no is greater
3

so the mid ele is :7

User--plz choose proper option
1) Correct no gussed
2) no is less
3) no is greater
2

so the mid ele is :5

User--plz choose proper option
1) Correct no gussed
2) no is less
3) no is greater
3

so the mid ele is :6

User--plz choose proper option
1) Correct no gussed
2) no is less
3) no is greater
1
element is CORRECTLY guessed = 0
The ele is found
*/
