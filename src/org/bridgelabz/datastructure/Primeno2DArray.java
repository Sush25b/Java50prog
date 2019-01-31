
/*********************************************************************************************************
 * @purpose : Take a range  find the Prime numbers in that range. Store the prime numbers in a 2D Array, 
 * 				the first dimension represents the range 0-100, the second dimension represents the prime numbers 
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 14-01-2019
 *
 *********************************************************************************************************/

package org.bridgelabz.datastructure;

import org.bridgelabz.utility.Utility;

public class Primeno2DArray 
{

	  static  int k=0,count=0;
	  static  int endrange=100; //endrange of primenos in A particular row of 2D 
	  static  int startrange=0; //startrange of primenos in A particular row of 2D 
	  
	  
	  public static void main(String[] args)
	  {
			  //input start Range--->of Prime no 
			   System.out.print("Enter the first number : ");  
		       int start = Utility.inputInteger(); 
		       
		      //input end Range--->of Prime no 
		       System.out.print("Enter the second number : ");  
		       int end = Utility.inputInteger(); 
		       
		      //Primearray to store  the Prime nos
		       int primearr[]=new int[end];

		  //print input details
	      System.out.println("List of prime numbers between " + start + " and " + end);  
		       
			   /**
			    * to check the nos are prime or not
			    * 	if prime then store in the primearray
			    */
			  	for (int i = start; i <= end; i++)
			  	{  
		  		   //method call  isPrime to check prime logic
		  			if (Utility.isPrime3(i)) 
		  			{  
		  				//if the i  nos is prime then store in primearr 
		  					//count ---> is to count nos of total prime nos inserted in array 
		  				primearr[count] =i; 
		  				count++;	
		  			} 
			  	}  
		  	
		  	System.out.println();
		  	
		  	//to Dispay primearr[]
		  	for (int i = 0; i <count ; i++)
		  	{   
		  		   System.out.print(primearr[i]+" ");
		  	}  
		  	
		  System.out.println("\n");
		  
		  System.out.println("PRIME NOS in 2D array");
		  
		  
			  //to print prime nos in 2D format
			  	for (int m = 0; m <= 9; m++)	//rows
			  	{  
			  		System.out.print("Range "+startrange+"- "+endrange+"\t"+"|");
			  		for (int n = 0; n <= 100; n++) //columns
				  	{
			  			    //array elements at the end are empty--->default 0 ,then dont print
			  				if(primearr[k] < endrange && primearr[k]!=0)
			  				{
			  					System.out.print(primearr[k]+"\t"+"|");
			  					k++;
			  				}
			  				
			  		} 
			  		System.out.println();
			  		startrange =startrange +100;
			  		  endrange =endrange +100;				
			  	}  
	  } 
}
