package org.bridgelabz.objectorientedprogram;

import java.util.ArrayList;
import java.util.List;

import org.bridgelabz.utility.Utility;
import org.bridgelabz.utility.oopsUtility.OopsUtility;

public class InventoryManagement
{
	public static void main(String args[]) throws Exception
	{
		List<InventoryList> list = new ArrayList<InventoryList>();
		List<Inventory2> listin = new ArrayList<Inventory2>();
		Inventory inventory = new Inventory();
		String filename = "inventory2.json";
		String str = OopsUtility.convertJavaToJson(filename);
		int count = 10;
		do {
			System.out.println("Enter the choice");
			System.out.println("1:Read and Display 2:Add and Write 3:Calculate the total price  4:Quit");
			int choice = Utility.inputInteger();
			switch (choice)
			{
			case 1:
				try {
					list = (List<InventoryList>) OopsUtility.convertJsonToJava(str, InventoryList.class);
					
					for (int i = 0; i < list.size(); i++)
					{
						InventoryList inList = list.get(i);
						
						System.out.println("Inventory name: " + inList.getInventoryName());
						
						for (int j = 0; j < inList.getListofInventories().size(); j++) 
						{
							System.out.println("Name: " + inList.getListofInventories().get(j).getInventoryname());
							System.out.println("Weight: " + inList.getListofInventories().get(j).getInventoryweight());
							System.out.println("Price: " + inList.getListofInventories().get(j).getInventoryprice());
						}
						System.out.println("---------------------------------------------------------------");
					}
				} catch (Exception e) {
					System.out.println("Enter data");
				}
				break;
			case 2:
				int flag = 1;
				int flag1=0;
				try {
					list = (List<InventoryList>) OopsUtility.convertJsonToJava(str, InventoryList.class);
					while (flag == 1) {
						System.out.println("Enter the inventory name: ");
						String inName = Utility.inputStringNext();
						if (!list.isEmpty()) 
						{
							for (InventoryList in : list) 
							{
								if (inName.equals(in.getInventoryName()))
								{
									listin = in.getListofInventories();
									
									//Method 1- using non-static function of ApplicationUtility class
									//of com.bridgelabz.util package
									Inventory2 inventory3 = new Inventory2();
									
									System.out.println("Enter the name:");
									inventory3.setInventoryname(Utility.inputString());
									System.out.println("Enter the weight");
									inventory3.setInventoryweight(Utility.inputFloat()); 	
									System.out.println("Enter the price");
									inventory3.setInventoryprice(Utility.inputDouble());
									
									listin.add(inventory3);
									flag1=1;
								}
							}
						}
						if (list.isEmpty()||flag1==0) 
						{
							Inventory2 inventory2 = new Inventory2();
							
							System.out.println("Enter the name:");
							inventory2.setInventoryname(Utility.inputString());
							System.out.println("Enter the weight");
							inventory2.setInventoryweight(Utility.inputFloat()); 	
							System.out.println("Enter the price");
							inventory2.setInventoryprice(Utility.inputDouble());
							
							listin.add(inventory2);
						}
						System.out.println("Do you want to add more? if yes press 1 else 0");
						flag = Utility.inputInteger();
					}
					System.out.println("The entered element is added to the list");
					
					String json = OopsUtility.convertJavaToJson(list);
					OopsUtility.convertJsonToJava(json, Inventory.class);
					System.out.println("Inventory list has been written on to file");
				} catch (Exception e) {
					System.out.println("File is empty!");
				}
				break;
			case 3: try{
						list=(List<InventoryList>) OopsUtility.convertJsonToJava(str, InventoryList.class);
						//Method 2- using non-static function of ApplicationUtility class
						//of com.bridgelabz.util package
						//ApplicationUtility.calulatePrice(list);
						
					}catch(Exception e){
						System.out.println("File is empty!");
					}
			case 4:
				System.exit(0);
			}
			count--;
		} while (count != 0);
	}
	
}
