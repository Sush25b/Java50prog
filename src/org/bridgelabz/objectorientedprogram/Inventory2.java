package org.bridgelabz.objectorientedprogram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Inventory2 
{
	private String Inventoryname;
	private float Inventoryweight;
	private double Inventoryprice;
	
	public Inventory2() {

	}
	
	public Inventory2(String inventoryname, float inventoryweight, double inventoryprice) {
		super();
		Inventoryname = inventoryname;
		Inventoryweight = inventoryweight;
		Inventoryprice = inventoryprice;
	}
	public String getInventoryname() {
		return Inventoryname;
	}
	public void setInventoryname(String inventoryname) {
		Inventoryname = inventoryname;
	}
	public float getInventoryweight() {
		return Inventoryweight;
	}
	public void setInventoryweight(float inventoryweight) {
		Inventoryweight = inventoryweight;
	}
	public double getInventoryprice() {
		return Inventoryprice;
	}
	public void setInventoryprice(double inventoryprice) {
		Inventoryprice = inventoryprice;
	}
	@Override
	public String toString() {
		return "Inventory2 [Inventoryname=" + Inventoryname + ", Inventoryweight=" + Inventoryweight
				+ ", Inventoryprice=" + Inventoryprice + "]";
	}

}
