 
/*********************************************************************************************************
 * @purpose : Palindrome-Checker by using DEQueue 
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/

/* HERE we r goint to use Mystack Class---ka object to{ push & pop} 
 * 
 * look for Mystack program
 */
package org.bridgelabz.datastructure.balanceParanthesis;

import org.bridgelabz.utility.Utility;

import java.util.Scanner;

public class BalanceParathesis
{

	public static void main(String[] args)
	{
		String s; 	//blank String
	   	 
		int counter=0; //instance variable a counter 
		
		System.out.println("Enter the String to check paranthesis balanced OR not" );
	    s = Utility.inputString();
     
		 /**
		  * Converting String s to Char ARRAY--->to take single single char 
		  */
		 char[] c= s.toCharArray();
		
		 
		//HERE we pass the size of String to {Mystack ---constructor} 
		//and ceate new stack
		Mystack m=new Mystack(s.length());	//s.length---is the String length
			
				/**
				 * for loop to traverse each element of the Char Array i.e i/p String
				 * 
				 */
				for(int i=0; i<s.length() ;i++)
				{
				    //if '(' comes of String--->now we started to push--->the elements to STACK 
					if( c[i]=='(')
			     	{
			     		m.push(c[i]);
			     		
			     		counter++;       //increase the count when push done
			     		System.out.println(counter); 
			     	} 
			     	else
			     		//if ')' comes of char ARRAy--->now we started to pop--->the elements from STACk 
			     		if( c[i]==')' )
			     		{	
			     			m.pop();
			     			
			     	        counter--;   //decrease the Count when pop happens
			     	       System.out.println(counter);
			     		}
				}


			if(counter==0)
			{
				System.out.println("it is Balanced parathesis");
			}
			else
			{
				System.out.println("it is not Balanced parathesis");
			}
      }
}	
//char ch= (char)m.pop();
//	if( (boolean)m.isempty()!=false)
	