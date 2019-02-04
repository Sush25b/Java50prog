package org.bridgelabz.designpattern.Structural.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomerUser 
{
	private static int choice;  
	
    public static void main(String args[]) throws NumberFormatException, IOException
    {  
    	 InputStreamReader isr=new InputStreamReader(System.in);
		 BufferedReader br=new BufferedReader(isr);
		   
        do{       
	            System.out.print("========= Choose Bank============ \n");  
	            System.out.print("            1. SbiBank.              \n");  
	            System.out.print("            2. UnionBank.              \n");  
	            System.out.print("            3. Yesbank.            \n");  
	            System.out.print("Enter your choice: ");  
	              
	            choice=Integer.parseInt(br.readLine());  
	              
	           Atmfacade atmf=new Atmfacade();
	              
	            switch(choice) 
	            {  
			           case 1:  
				                {   
				                  atmf.SbibankDetails();
				                }  
				                break;  
				       case 2:  
				                {  
				                  atmf.UnionBankDetails();       
				                }  
				                break;    
				       case 3:  
				                {  
				                  atmf.YesBankDetails();       
				                }  
				                break;  
				                
			           default:  
			           {    
			                System.out.println("Atm cannot connect-->to that bank");  
			           }         
			           return;  
	            }  
          
        	}while(choice!=4);  
    }  
}
