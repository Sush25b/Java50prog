 package org.bridgelabz.designpattern.creational;

public class Demo 
{
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
	//Object1---> created by user
		Bookshop bs=new Bookshop();
		//bs.d();
		bs.setShopname("Novelty");
		bs.loaddata();
	    //bs.d();
		System.out.println(bs);
		System.err.println("----------------------------------------------------");
		
		
	//Note2 types of clone	
		
	//Method 1: Shallow clone i.e 1 object but 2 reference,>>> bs and bs1 point same object 	
	//Object2----> used Clone() method, new Object now created
		//Bookshop bs1= (Bookshop) bs.clone();
		//bs1.d();
	  //bs1.setShopname("Smash");
		//bs1.loaddata();===>we r going to use Clone object,so no need of using LoadData() method
		//System.out.println(bs1);
		
	//Method 2: deep clone	i.e 2 diffrent object,>>>1 object will have 1 reference 
		Bookshop bs2= bs.clone();
		bs2.setShopname("Smash");
		//bs1.loaddata();===>we r going to use Clone object,so no need of using LoadData() method
		System.out.println(bs2);
		
		
	}
}
