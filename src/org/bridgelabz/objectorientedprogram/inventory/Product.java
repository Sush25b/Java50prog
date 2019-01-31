package org.bridgelabz.objectorientedprogram.inventory;

import java.util.List;

public class Product {
	
	private String productName;	//inventory name
	
	private List<ProductProperty> properties; //product properties
	
	public String getProductName() 
	{
		return productName;
	}
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	public List<ProductProperty> getProperties() {
		return properties;
	}
	public void setProperties(List<ProductProperty> properties) {
		this.properties = properties;
	}	

}
