package org.bridgelabz.designpattern.creational.factory;

public class ComputerFactory
{
	public Computer getComputer(String type,int price,String company)
	{
		if("PC".equals(type))
		{
			return new PC(company, price, company);
		}
		
		if("Laptop".equals(type))
		{
			return new Laptop(company, price, company);
		}
		
		return null;
	}
}
