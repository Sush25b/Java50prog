package org.bridgelabz.designpattern.Structural.facade;

public class Sbibank implements Bank 
{

	@Override
	public void Bankname() 
	{
		System.out.println("SBI Bank of India");
	}

	@Override
	public void withdrawLimit() 
	{
		System.out.println("Rs 50000");
		
	}

}
