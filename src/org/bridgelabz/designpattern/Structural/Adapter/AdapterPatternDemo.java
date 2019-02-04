package org.bridgelabz.designpattern.Structural.Adapter;

public class AdapterPatternDemo
{
		 public static void main(String args[])
		 {  
		  
		   CreditCard targetInterface=new BankCustomerAdapter();  
		       targetInterface.giveBankDetails();    
		  
		  System.out.print(targetInterface.getCreditCard());  
		 }   
}
