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
	    	
	    	
	    	
	    	static boolean isAnagram(String str1, String str2) 
		    {  
		    
		       /*if their is place between two string--------- then replace it with "" 
		    	
		        String s1 = str1.replaceAll("\\s", "");  
		        String s2 = str2.replaceAll("\\s", "");  
		       */
		    	
		       int c1[]= countAlpha(str1);
		       int c2[]= countAlpha(str2);
		        

		       		for(int i=0;i<26;i++)
		       		{
			    	   if(c1[i]!=c2[i])
			    	   {
			    		   return false;
			    	   }
		       		}
		       
		       return true;
		       
		    }
		    
		   
		       
		    }
		    

		    	
			
		  
    	}
	 
	 
	    
}
