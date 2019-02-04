package org.bridgelabz.designpattern.creational.factory;

abstract class Computer 
{
	 abstract String getDeviceCode(); 
	
	 abstract void getDetails();
	 
	@Override
	public String toString() 
	{
		return "\n Computer getDeviceCode()="+getDeviceCode();
	}
}

