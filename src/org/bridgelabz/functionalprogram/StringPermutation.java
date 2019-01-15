package org.bridgelabz.functionalprogram;

import org.bridgelabz.utility.Utility;

public class StringPermutation 
{
	 public static void main(String[] args) 
	    { 
		   
	        String str = "ABC"; 
	        int n = str.length(); 
	       
	        Utility.stringPermutation(str, 0, n-1); 
	    } 
}
