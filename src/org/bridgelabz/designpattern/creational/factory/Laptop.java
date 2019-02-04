package org.bridgelabz.designpattern.creational.factory;

public class Laptop extends Computer
{
	private String type;
	private int price;
	private String company;
	
	public Laptop(String type, int price, String company) 
	{
		this.type = type;
		this.price = price;
		this.company = company;
	}

	String strcode="02#344452";
	
	public String getDeviceCode()
	{
		return strcode;
	}
	
	public void getDetails()
	{
		System.out.println("Laptop details");
		System.out.println("type :"+ type +" price "+price+" company "+company); 
	}

}
