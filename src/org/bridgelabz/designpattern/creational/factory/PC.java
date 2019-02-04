package org.bridgelabz.designpattern.creational.factory;

public class PC extends Computer
{
	private String type;
	private int price;
	private String company;
	
	public PC(String type, int price, String company)
	{
		this.type = type;
		this.price = price;
		this.company = company;
	}

	private String strcode="01#123";
	
	public String getDeviceCode()
	{
		return strcode;
	}
	
	public void getDetails()
	{
		System.out.println("PC details");
		System.out.println("type:"+ type +"  price:"+price+"  company:"+company); 
	}
	
}
