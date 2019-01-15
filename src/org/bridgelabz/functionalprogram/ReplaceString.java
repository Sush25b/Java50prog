/*********************************************************************************************************
 * @purpose : Taking User Input and Replace String Template “Hello <<UserName>>, How are you?”
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/
package org.bridgelabz.functionalprogram;

import org.bridgelabz.utility.Utility;

public class ReplaceString 
{
	  
  public static void main(String[] args) 
   {
	  
	  //Taking input String from the user
	  System.out.println("User please enter the name");
	  String s= Utility.inputString();
	  
	  System.out.println("---------------------------");
	  
	  System.out.println("Hello "+ s+",how are you?");
    }  
}

/*
User please enter the name
abc
---------------------------
Hello abc,how are you?
*/
