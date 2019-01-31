
/*********************************************************************************************************
 * @purpose : Palindrome checker by using Deque 
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 14-01-2019
 *
 *********************************************************************************************************/


package org.bridgelabz.datastructure.palindromeChecker;

import java.util.Arrays;

import org.bridgelabz.utility.Utility;

//NOTE: HERE we use MyDueue program, both side--->insertion deletion can happen will happen
public class PalindromeDeque 
{
	public static void main(String[] args)
	{
		//blank i/p String
		String s;
	 
		//taking string as a i/p from user
		System.out.println("Enter the string for paindrome " );
		 s=Utility.inputString();
     
		 /**
		  * 
		  * 
		  * Converting String to Char ARRAY---to take single single char 
		  */
		 char[] c= s.toCharArray();
		
		 
		//HERE we pass the size of String to {Mystack ---constructor} 
			 //and ceate new STACK
		MyDeque m=new MyDeque(c.length);	//c.length---is the Char array length
		
		//inserting the i/p string---> in reverse order in the the DEQUE 
		for(int i=c.length-1 ; i>=0 ;i--)
		{
			m.rearenqueue(c[i]);	
		}
			
		//to print the MyDeque detials
		System.out.println("\n"+"The New MyDeque array is: "+"\n"+ m);
		System.out.println("\n"+"Matching both the queue:----input String and MyDeque");
			
	    	boolean status=true; //to store condition-->matched or not
	    	
	    	/**
	    	 *to traverse each element of the Deque and match with Char Array{i/p string} 
	    	 */
			for(int i=0 ; i<c.length ;i++)
			{
				if(c[i]!=(char) m.frontdequeue())
				{
					status=false;	
					break;
				}
				status=true;
			}
			
			if(status)
			{
				System.out.println("it is palindrome");
			}
			else
				System.out.println("not a plindrome");
			
	}		
			
}
