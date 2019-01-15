package org.bridgelabz.functionalprogram;

public class prim 
{
	public static void main(String args[])
	{    
		  int i,m=0,flag=0;
		  
		  int n=6;//it is the number to be checked
		  
		  m = n/2;
		  
		       System.out.println("m"+m);
		       
		  if(n==0||n==1)
		  {  
			  System.out.println(n+" is not prime number");      
		  }
		  else
		      {  
			  		for(i=2;i<=m;i++)
			  		{      
			             System.out.println(i+"i");
			             	if(n%i==0)
			             	 {      
			             		System.out.println(n+" is not prime number");      
			             		flag=1;      
			             		break;      
			             	 }      
			  		}      
			  		if(flag==0) 
			  		{ System.out.println(n+" is prime number");
			        }  
		     }//end of else  
	}    
}
