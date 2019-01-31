package org.bridgelabz.objectorientedprogram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.bridgelabz.utility.oopsUtility.OopsUtility;
import org.codehaus.jackson.map.jsontype.impl.StdSubtypeResolver;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockReport 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		try 
		{
			JSONParser jsonparser=new JSONParser();
			
			FileReader fils=new FileReader("Stock.json");
			
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
			
				String s=obj.toJSONString();
				
				
				Stock stk=OopsUtility.convertJsonToJava(s, Stock.class);
				
				System.out.println(stk);
				long value2= stk.getPrice() * stk.getNumbersOfShares();
				System.out.println("value : "+value2);
				System.out.println("------------------------------------------------------------------");
				/*
				 * here the Json obj===>first ele of array cannot be dircty convert to Stock class object
				 * 			bzc we want string of the obj first--->to pass in  the method convertJsonToJava(String,Stock)
				 * 
				 * Stock stk=OopsUtility.convertJsonToJava(obj, Stock.class);
				 */
				String name= (String) obj.get("stockname");
				long price= (long) obj.get("price");
				long numberOfShare= (long) obj.get("numbersOfShares");
				
				long value= price*numberOfShare;
				
				System.out.println("name:"+" "+name+" , price: "+price+" , number of share"+numberOfShare+" , value "+value);

			}
		}
		catch (IOException | ParseException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}





/*
 static void printStockReport()
	{
		ObjectMapper mapper=new ObjectMapper();
		JSONObject name[];
		Object o[];
		try {

			Object obj = parser.parse(new FileReader("/home/bridgelabz/stockmaintain.json"));
			//System.out.println(obj);
			JSONArray array=new JSONArray();
			array=(JSONArray) obj;
			//System.out.println(array.size());
			name=new JSONObject[array.size()];
			o=new Object[array.size()];
			JSONObject jsonObject[]=new JSONObject[array.size()];
			int j=1;
			for (int i = 0; i < array.size(); i++)
			{
				
				o[i]=array.get(i);

				jsonObject[i]=(JSONObject) o[i];
				
				//System.out.println(jsonObject[i]);
				String cat="Stock"+j;
				name[i] = (JSONObject) jsonObject[i].get(cat);
				j++;
				Stock1 s=new Stock1();
				s.setAmount((long)name[i].get("TotalAmount"));
				s.setNoOfShare((long)name[i].get("NumberOfShare"));
				s.setSharePrice((long)name[i].get("SharePrice"));
				s.setStockName((String)name[i].get("StockName"));
				s.setStockSymbol((String)name[i].get("StockSymbol"));
				System.out.println(s.getStockName()+" "+s.getNoOfShare()+" "+s.getSharePrice()+" "+s.getAmount()+" "+s.getStockSymbol());
			}
			
		} catch (IOException | ParseException e) {
		
			e.printStackTrace();
		}
	}
*/
