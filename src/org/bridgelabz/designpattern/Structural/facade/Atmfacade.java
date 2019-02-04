package org.bridgelabz.designpattern.Structural.facade;

public class Atmfacade 
{
	private Bank Sbibank;
	private Bank UnionBank;
	private Bank YesBank;
	
	public Atmfacade()
	{
		Sbibank=new Sbibank();
		UnionBank=new UnionBank();
		YesBank=new YesBank();
	}
	
	public void SbibankDetails()
	{
		Sbibank.Bankname();
		Sbibank.withdrawLimit();
	}
	
	public void UnionBankDetails()
	{
		UnionBank.Bankname();
		UnionBank.withdrawLimit();
	}
	
	public void YesBankDetails()
	{
		YesBank.Bankname();
		YesBank.withdrawLimit();
	}
}
