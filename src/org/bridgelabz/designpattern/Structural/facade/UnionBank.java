package org.bridgelabz.designpattern.Structural.facade;

public class UnionBank implements Bank 
{
	@Override
	public void Bankname() 
	{
		System.out.println("UnionBank of India");
	}

	@Override
	public void withdrawLimit() 
	{
		System.out.println("Rs 75000");
		
	}

}
