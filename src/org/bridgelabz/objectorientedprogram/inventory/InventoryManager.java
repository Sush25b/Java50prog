package org.bridgelabz.objectorientedprogram.inventory;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


import org.bridgelabz.utility.Utility;
import org.bridgelabz.utility.oopsUtility.OopsUtility;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventoryManager 
{
	ArrayList<Object> array=new ArrayList<Object>();
	
	public static void main(String[] args)
	{
		FileReader fils=null;
			
	    try 
	   {
			JSONParser jsonparser=new JSONParser();
			
			fils=new FileReader("InventoryFactory.json");
			
			Object objpar;
				objpar = jsonparser.parse(fils);
			
			JSONArray jarr=(JSONArray) objpar;
			
			for (Object i: jarr)
			{ 
				JSONObject obj=(JSONObject)i;
				
				String s=obj.toJSONString();
				
				//convert String(of JSON)--->to java as, the ARRAY list(OBJECT type)===>we cannot store JSON object  directly
				Product prd=OopsUtility.convertJsonToJava(s,Product.class);
				     
				//Store javaobject(prd) in the linked list
					   listdata.add(prd); //----ARRAY list is Object type

			Product product=new Product();
			
			System.out.println("Enter the name of the product ");
			String inputProductName= Utility.inputStringNext();
			product.setProductName(inputProductName);
			ProductProperty productProperty= input();
			List<ProductProperty> properties=new ArrayList<ProductProperty>();
			properties.add(productProperty);
			
			product.setProperties(properties);

			for(k=0,k<)
			{
				ProductList productlist=productlist.get(count);
				for(ProductProperty  produproperty: prod.getProperties())
				{
					System.out.print(produproperty.getName() +" - ");
					double eachinventory =(produproperty.getPrice());
					System.out.println(eachinventory);
				}
				count++;
			}
			
			inventoryFactory.setInventory(products);
			objectMapper.writeValue(file, inventoryFactory);
			//create new object using object mapper , it has a function called "writerWithDefaultPrettyPrinter()"
			//which will indent your json file in the console
			ObjectMapper objectMapper2 =new ObjectMapper();
			System.out.println(objectMapper2.writerWithDefaultPrettyPrinter().writeValueAsString(inventoryFactory));
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("program CRASHED..!!! please run again");
		}
	}
	public static ProductProperty input()
	{
		ProductProperty productProperty=new ProductProperty();
		System.out.println("Enter the name of product type ");
		String inputPropertyName=Utility.inputString();
		productProperty.setName(inputPropertyName);
		
		System.out.println("Enter the Weight ");
		double inputPropertyWeight=Utility.inputDouble();
		productProperty.setWeight(inputPropertyWeight);
		
		System.out.println("Enter the Price ");
		double inputPropertyprice=Utility.inputDouble();
		productProperty.setPrice(inputPropertyprice);

		return productProperty;

	}
}
