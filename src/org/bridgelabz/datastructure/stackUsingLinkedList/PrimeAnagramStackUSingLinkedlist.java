
/*********************************************************************************************************
 * @purpose : to find prime and anagram of given range where we have to use stack
 * 				by implemented stack using Linked List and the node data type is integer
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/

package org.bridgelabz.datastructure.stackUsingLinkedList;

import org.bridgelabz.utility.Utility;

public class PrimeAnagramStackUSingLinkedlist 
{
	static int counter=0;
	
	//StackUsingLinkedList object is created
	static StackUsingLinkedList slt=new StackUsingLinkedList ();
	
 	 /**
 	  * to find Prime and Anagram----of given range nos 
 	  * @param start :range start of nos to check prime and anagram
 	  * @param end   :end range
 	  * @return		:void
 	  */
	  public static void  primeAndAngaram4(int start,int end)
	  {	 
	  
		    //make any size array---TO STORE PRIME NOS
		  	int[] primearr=new int[end]; 
		  	
		  	//to find prime 
		  	for (int i = start; i <= end; i++)
		  	{  
		  		  //#1//call goes to isPrime2 method--to check prime or not
		  			if (Utility.isPrime4(i)) 
		  			{  
		  				primearr[counter]=i; //insert no--->if it is prime
		  				
		  				counter++;
		  			}  
		  	}  
		  	
			//to print normal array---of prime nos
		  	for (int k=0; k<counter; k++)
			  	{  
			  			System.out.print(primearr[k]+" ");
			  	}
		  	
		  	System.out.println(" ");
		  	System.out.println("Now prime and anagram nos r as follows:");
		  	System.out.println(" ");
		  	
		  	//getting the prime nos store in----primearr[]
		  	for (int j=0; j<counter; j++)
		  	{  
		  						//#2//call goes to get palindrome of a  no
		  				int reverse= Utility.Anagram4(primearr[j]);  //palindrome of each primeno---of primearr[]
		  		 
		  		 //matching the palindrome of every no---with the Array(of prime no)
		  	     for(int k=0; k<counter; k++)
		  	     {
		  	    	 if(primearr[k]==reverse)  ///if matched then add prime no and anagram to LINKED LIST
		  	    	 {
		  	    		 		slt.insertAtTop(primearr[j]);
		  	    		
		  	    		 	slt.insertAtTop(reverse);
		  	    	 }
		  	     }
		  	}
		  	
	  }
	
	 public static void main(String[] args) 
	   {   
	       //take input start range of nos to find prime
	       System.out.print("Enter the first number : ");  
	       int start = Utility.inputInteger(); 
	       
	       //take input end range of nos to find prime
	       System.out.print("Enter the second number : ");  
	       int end = Utility.inputInteger(); 
	       
	       //print range to nos whose pprime to be find
	       System.out.println("List of prime numbers between " + start + " and " + end);  
	       
	       //calling method to get the nos prime and anagram
		   primeAndAngaram4(start, end);
		 
		   //display the linked list
		   slt.show();
		   
	   }
}
