
/*********************************************************************************************************
 * @purpose :  to read an integer as an Input, convert to Binary using toBinary function and Swap nibbles and find the new number.

 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/
package org.bridgelabz.alogrithm;

import java.lang.Math;

import org.bridgelabz.utility.Utility;


public class ToBinary 
{
	  
	 public static void main(String args[]) 
	 { 
	  
		System.out.println("enter the INTEGER no to covert to binary "); 
		//taken an integer
	    int l = Utility.inputInteger(); 
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



