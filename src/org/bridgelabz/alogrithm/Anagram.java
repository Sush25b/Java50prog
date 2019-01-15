/*********************************************************************************************************
 * @purpose :  Taking User Input and Replace String Template “Hello <<UserName>>, How are you?”
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/


package org.bridgelabz.alogrithm;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class Anagram 
{ 
	    public static void main(String[] args)  
	    {  	
	    	//taking user input
	    	System.out.println("Enter the 1st String:");
	    	String str1 = Utility.inputString();
	    	
	    	//taking user input
	    	System.out.println("Enter the 2nd String:");
	    	String str2 = Utility.inputString();
		
	    	//calling anagram method--to check the String are anagram 
	    	boolean status= Utility.anagram(str1,str2);  
	        
	    	//to check 2 strings r anagram or not 
	    	 if (status) 
		        {  
	    		     System.out.println("it is a anagram");
		        }
	    	 else
	    	 	{  
    		     System.out.println("it is not a anagram");
	    	 	}
		        
	    }  
}
