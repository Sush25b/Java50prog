package org.bridgelabz.designpattern.Structural.facade;

public class YesBank implements Bank
{
	@Override
	public void Bankname() 
	{
		System.out.println("YesBank of India");
	}

	@Override
	public void withdrawLimit() 
	{
		System.out.println("Rs 1000");
	}
}
