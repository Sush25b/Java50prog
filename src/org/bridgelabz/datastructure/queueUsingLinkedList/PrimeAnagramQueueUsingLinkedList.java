
/*********************************************************************************************************
 * @purpose : to find prime and anagram of given range where we have to use QUEUE
 * 				by implemented QUEUE using Linked List and the node data type is integer
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/

package org.bridgelabz.datastructure.queueUsingLinkedList;

import org.bridgelabz.utility.Utility;

public class PrimeAnagramQueueUsingLinkedList
{
	static int counter=0;
	
	//created QueueUsingLinkedList object 
	static QueueUsingLinkedList<Integer>  qlt=new QueueUsingLinkedList<Integer> ();
 	 
 	 /**
 	  * to find Prime and Anagram----of given range nos 
 	  * @param start : range start of nos to check prime and anagarm
 	  * @param end   : range end
 	  * @return      : void
 	  */ 
	  public static void  primeAndAngaram3(int start,int end)
	  {	 
	  
		    //make any size array---TO STORE PRIME NOS
		  	int[] primearr=new int[end]; 
		  	
		  	//to find prime nos of the input range
		  	for (int i = start; i <= end; i++)
		  	{  
		  		  //#1//call goes to isPrime2 method--to check prime or not
		  			if (Utility.isPrime5(i)) 
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
		  			int reverse= Utility.Anagram5(primearr[j]);  //palindrome of each primeno---of primearr[]
		  		 
		  		 //matching the palindrome of every no---with the Array ele(of prime no)
		  	     for(int k=0; k<=counter; k++)
		  	     {
		  	    	 if(primearr[k]==reverse) //if matched then push prime and reverse/anagram in LINKED LIST
		  	    	 {
		  	    		 		qlt.insertAtEnd(primearr[j]);
		  	    		
		  	    		 	qlt.insertAtEnd(reverse);
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
	       
		   primeAndAngaram3 (start, end);
		   
		   //display the linked list
		   	qlt.show();
		   	
		   	//to pop the ele
		   	//int a=qlt.pop();
		   
	   }
}
