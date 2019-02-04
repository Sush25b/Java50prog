package org.bridgelabz.designpattern.creational.factory;

public class BuyComputer 
{
	public static void main(String[] args) 
	{
		ComputerFactory compf=new ComputerFactory();
		
		Computer comp= compf.getComputer("PC",89555,"Hp");
		
		Computer comp2= compf.getComputer("Laptop",89555,"Hp");
		
		comp.getDetails();	//---> it will print the details 
		comp.getDeviceCode(); //---> it will not print as, the method here is only priniting
		
		System.out.println(comp); //print the object.toString ,so now toString is called
		
	  System.out.println("----------------------------");
		comp2.getDetails();
		comp2.getDeviceCode();
		
		System.out.println(comp2);
	}
}
