package org.bridgelabz.objectorientedprogram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;;

public class Inventory 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		try {
		
				JSONParser jsonparser=new JSONParser();
				
				FileReader fils=new FileReader("Inventory.json");
				
				Object objpar=jsonparser.parse(fils);
				
				JSONArray jarr=(JSONArray) objpar;
				
					//METHOD 1- normal printing
					//System.out.println(inventorylist);
				
				//OR METHOD 2-BY using iterator
				Iterator iterator= jarr.iterator();
				while(iterator.hasNext())
				{
					System.out.println(iterator.next());
				}
				
				/**
				 * taking jarr array each element i.e jarr[i]
				 */
				for(Object i: jarr)
				{
					/*
					A] taking each array element--->jarr[i]
					       System.out.println(i);		{"RICE":{"price":150,"name":"Rice","weight":2}}
					
					OR 
					
				  B] another way */
				  //#1 //taking each array element--->jarr[i]  & convert in JSONObject
					JSONObject obj=(JSONObject) i;
					System.out.println("\n");
					
				 /* //#2 now Printing each array element jarr[i] that is--->covert to JSONObject
						System.out.println(obj);    {"RICE":{"price":150,"name":"Rice","weight":2}}
						System.out.println("\n");
					
					
					refer above line 
					//#3 now getting the Containt OR value of that particular JSONObject--->e.g "RICE","PULSES"
							here in obj2 we get containt of "RICE"
							here "RICE" is key--->we want its value , so use obj.get("key")--->we will get value of that particular key
					*/
					JSONObject obj2=(JSONObject)obj.get("RICE");
					System.out.println(obj2);   //{"price":150,"name":"Rice","weight":2}
				
					
					//In RICE object--->containts r "name","price" etc, so to get the value of key(name) 
							//so use obj2.get("key")--->we will get value of that particular key
					String name= (String) obj2.get("name");
					long price= (long) obj2.get("price");
					long weight= (long) obj2.get("weight");
					
					long value= price*weight;			
					System.out.println(name+" inventory have value of: "+value);
		//**************************************************************************************
					JSONObject obj3=(JSONObject)obj.get("PULSES");   //{"price":150,"name":"Rice","weight":2}
					System.out.println(obj3);
					
					//In RICE object--->containts r "name","price" etc, so to get the value of key(name) 
							//so use obj2.get("key")--->we will get value of that particular key
					String name2= (String) obj3.get("name");
					long price2= (long) obj3.get("price");
					long weight2= (long) obj3.get("weight");
					
					long value2= price*weight;
					
					System.out.println(name2+" inventory have value of: "+value2);
			}		
		} 
		catch (IOException | ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
