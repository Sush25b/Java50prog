package org.bridgelabz.objectorientedprogram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.bridgelabz.utility.oopsUtility.OopsUtility;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockAccountRead
{
	public static void main(String[] args) throws IOException
	{
		FileReader fils=null;
		try
		{
			JSONParser jsonparser=new JSONParser();
			
			fils=new FileReader("customer.json");
			
			Object objpar;
	
					objpar = jsonparser.parse(fils);
	
			JSONArray jarr=(JSONArray) objpar;
			
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
			  //#1 //taking each array element--->jarr[i]  & convert in JSONObject
				JSONObject obj=(JSONObject) i;
				System.out.println("\n");
			
				//(String)(JSONObject)i ===>cannot be done {cannot cast JSONObject to String diretly
				String s=obj.toJSONString();
				
				Customer stk=OopsUtility.convertJsonToJava(s, Customer.class);
				
				System.out.println(stk);
				//long value2= stk.getPrice() * stk.getNumbersOfShares();
				//System.out.println("value : "+value2);
				System.out.println("------------------------------------------------------------------");
			}
		}
		catch (IOException | ParseException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			fils.close();
		}
	}
}
