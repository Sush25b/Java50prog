package org.bridgelabz.alogrithm;

import java.util.Scanner;

public class palindrome 
{
	 public static void main(String[] args)  
	    {  
	    
	    	Scanner sc=new Scanner(System.in);

	    	System.out.println("Enter the no to check palindrome");
	    	int n = sc.nextInt();
	    	
	    	int r,res=0;
	    	
	    	int temp=n;
	    	while(n>0)
	    	{
	    		r= n%10;
	    		res = (res*10)+r;
	    		n=n/10;		
	    	}
	    	
	    	if(res==temp)
	    	{
	    		System.out.println("print it is palindrome");
	    	}
	    	else
	    		System.out.println("print it is not a palindrome");
			  
    	}  
}
