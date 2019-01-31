
/*********************************************************************************************************
 * @purpose :  Prime Number Program are both Prime and Anagrams . Further store in a 2D Array the numbers that are Anagram and numbers that are not
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

public class PrimeAndAnagram2D
{
	static int counter=0,t=0,l=0;
	/**
 	  * check the no---is prime or not
 	  * @param n
 	  * @return : boolean
 	  */
 	 public static boolean isPrime2(int n) //e.g n=15 any no----from the given range
	  {  
		  		if (n <= 1)  //e.g n=15
		  		{  
		  			return false;  
		  		}  
     
		  	//e.g n=15
		  	for (int i = 2; i <= Math.sqrt(n); i++) //------use math.sqrt(n) or use n/2
		  	{  
		  			if (n % i == 0)
		  			{  
		  					return false;  
		  			}  
		  	}  
      
		  	return true;  
	  }  
 	 
 	 /**
 	  * to get palindrome of a no
 	  * @param m
 	  * @return : Integer
 	  */
 	 public static int palindrome(int m) //Anagram only
	  {
		  int r,sum=0,temp; 
		  
		  //It is the number variable to be checked for palindrome    
		  
		  while(m>0)
		  {    
		     r =   m % 10;  //getting remainder  
		     sum= ( sum * 10 ) + r;    
		     m = m / 10;    
		  }    
		  
         return sum; 
	  }
 	 
 	 /**
 	  * to find Prime and Anagram----of given range nos 
 	  * @param start
 	  * @param end
 	  */
	  public static void primeAndAngaram(int start,int end)
	  {	 
	  
		    //Array to store only primenos
		  	int[] primearr=new int[end]; 
		  	
		  //the nos which r {anagram and prime} are store to print in 2D format 
		  	int[] arr2D=new int[end]; 
		  	
		  	
		  	//to find prime 
		  	for (int i = start; i <= end; i++)
		  	{  
		  		//#1//call goes to isPrime2 method--to check prime or not
		  			if (isPrime2(i)) 
		  			{  
		  				primearr[counter]=i;
		  				
		  				counter++;
		  			}  
		  	}  
		  	
			//to print normal array---of prime nos
		  	for (int k=0; k<counter; k++)
			{  
			  		System.out.print(primearr[k]+" ");
		    }
		  	
		  	System.out.println("\n");
		  	System.out.println("Now prime and anagram  nos r as follows:");
		  	System.out.println(" ");
		  	
		  	for (int j=0; j<counter; j++)
		  	{  
	  					//#2//call goes to get Anagram/palindrome--->both same r here 
	  					int reverse= palindrome(primearr[j]); //get reverse of the no
		  		 
		  		 //matching the reverse of every no---with sach element Array(of prime no) 
		  	     for(int k=0; k<counter; k++)
		  	     {	
		  	    	 if(primearr[k]==reverse)
		  	    	 {   
		  	    		 arr2D[l]=primearr[j]; //insert primeno in arr2D
		  	    		 l++;                  // l---> is the arr2D[l]  counter 
		  	    		 
		  	    		 arr2D[l]=reverse;     //insert anagram/reverse of the primeno in arr2D
		  	    		 l++;
		  	    	 }
		  	     }
		  	}

			  //to print prime nos in 2D format
			  	for (int m = 0; m <= 5; m++)	//rows
			  	{  
			  		for (int n = 0; n <= 5; n++) //columns
				  	{
			  			if(arr2D[t]!= 0)
			  			{
			  					System.out.print(arr2D[t]+"\t"+"|");
			  					t++;   // t---> here is the arr2D[t]  counter 
			  		    }
			  		} 
			  		System.out.println();				
			  	}   	
	  }  
	  
	  public static void main(String[] args) 
	   {   
	       //take start range of prime no
	       System.out.print("Enter the first number : ");  
	       int start = Utility.inputInteger(); 
	       
	       //take end range of prime no
	       System.out.print("Enter the second number : ");  
	       int end = Utility.inputInteger(); 
	       
	       //print range of prime nos
	       System.out.println("List of prime numbers between " + start + " and " + end);  
	       
	       //call method to check nos---> are prime and anagram
		  primeAndAngaram(start, end);
	   }

}
