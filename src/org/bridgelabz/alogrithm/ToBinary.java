package org.bridgelabz.alogrithm;

import java.lang.Math;

import org.bridgelabz.utility.Utility;


public class ToBinary 
{
	  
	 public static void main(String args[]) 
	 { 
	  
		//taken an integer
	    int l = 234; 
	    System.out.println("the entered interger no is: "+l);
	  
	    //calling function to convert int--to binary 
	    String str1= Utility.convertToBinary(l);
	    
	    //printing the swap nibbles of the----which was int converted 
	    System.out.println("\n"+"swapping nibble  :"+ str1);
	    
	    int n= Integer.parseInt(str1);
	    
	  //calling function to convert  binary to int again
	    int decimalno= Utility.convertToDecimal(n);
	    
	    System.out.println("Decimal no :"+decimalno);
	 }
}



