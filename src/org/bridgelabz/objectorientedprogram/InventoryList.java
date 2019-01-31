package org.bridgelabz.objectorientedprogram;

import java.util.ArrayList;
import java.util.List;

public class InventoryList
{
	private String inventoryName;
	
	private List<Inventory2> listofInventories=new ArrayList<Inventory2>();

	public InventoryList() {

	}

	public String getInventoryName() {
		return inventoryName;
	}

	public InventoryList(String inventoryName, List<Inventory2> listofInventories) {
		super();
		this.inventoryName = inventoryName;
		this.listofInventories = listofInventories;
	}

	public void setInventoryName(String inventoryName) {
		this.inventoryName = inventoryName;
	}

	public List<Inventory2> getListofInventories() {
		return listofInventories;
	}

	public void setListofInventories(List<Inventory2> listofInventories) {
		this.listofInventories = listofInventories;
	}
}
