package org.bridgelabz.objectorientedprogram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

import org.bridgelabz.utility.*;
import org.bridgelabz.utility.oopsUtility.OopsUtility;
import org.bridgelabz.utility.oopsUtility.Utility;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;	

@JsonIgnoreProperties(ignoreUnknown = true)
public class StockAccount 
{	
	ObjectMapper objectMapper = getObjectMapper();
	//objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
	static Stock stock;
	static PresentSt pstock;
	static PresentStock presentstock;
	static TransactionDetails transite;
	
		/**
		 * to add customer
		 * @throws IOException
		 */
		//to store object in file by using object mapper
		public static void AddAccount(String filepath) throws IOException 
		{
			FileReader fils=null;	
			String t="";
			
				Customer cust=new Customer();
				
				System.out.println("enter ur id");
				int id=Utility.inputInteger();
				cust.setID(id);
			
				System.out.println("enter ur name");
				String name=Utility.inputStringNext();
				cust.setUsername(name);
				
				System.out.println("enter ur phone number");
				int phoneno=Utility.inputInteger();
				cust.setPhoneno(phoneno);
				
				System.out.println("Adding new Customer");
				
				//String m=OopsUtility.convertJavaToJson(cust);
				//System.out.println(m); 
				try
				{
					fils=new FileReader(filepath);
					
					JSONParser jsonparser=new JSONParser();
					
					Object objpar;
						objpar = jsonparser.parse(fils);
					
					JSONArray jarr=(JSONArray) objpar;
					
					String openbracket="[",closebracket="]";
					
					if(jarr.size()==0)
					{
						t=openbracket+OopsUtility.convertJavaToJson(cust)+closebracket;

					}
					else
					{
						String m=OopsUtility.convertJavaToJson(cust);
						
						for (int i = 0;i <jarr.size(); i++)
						{
								t=t+jarr.get(i)+",";
						}
						
						t = "["+ t+m +"]";
						System.out.println("writing...");
					}
					OopsUtility.filewrite(t,filepath);
				}
				catch (FileNotFoundException e)
				{
				// TODO Auto-generated catch block
				e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally
				{
				fils.close();
				}	
			}
		
		//to displat the deatils of present stock
		//i used Arraylist---->directlty store contain into it
		
	//*********************************************************************************
		private ObjectMapper getObjectMapper() {
			// TODO Auto-generated method stub
			return null;
		}

	//********************************************************************************
		public static void printReport(String filepath) throws IOException 
		{
			ArrayList<Object> listdata = new ArrayList<Object>();
	
			//JSONArray jArray = (JSONArray)jsonObject; 
		
			FileReader fils=null;
			
			    try 
			   {
					JSONParser jsonparser=new JSONParser();
					
					fils=new FileReader(filepath);
					Object objpar;
						objpar = jsonparser.parse(fils);
					
					JSONArray jarr=(JSONArray) objpar;
					
					for (Object i: jarr)
					{ 
						JSONObject obj=(JSONObject) i;
						
						String s=obj.toJSONString();
						
						//convert String(of JSON)--->to java as, the ARRAY list(OBJECT type)===>we cannot store JSON object  directly
						PresentStock prd=OopsUtility.convertJsonToJava(s, PresentStock.class);
						     
						//Store javaobject(prd) in the linked list
							   listdata.add(prd); //----ARRAY list is Object type
					} 
					
					System.out.println("\n"+"All Stocks are as follows"+"\n");
					for(Object i: listdata)
					{
						
						System.out.println(i);
						System.out.println("------------------------------------------------");
					}
				
				}
				catch (FileNotFoundException e)
				{
				// TODO Auto-generated catch block
				e.printStackTrace();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally
				{
				fils.close();
				}	
		}
		
	//**********************************************************************************
		public static int buy(int amount,int sharesToBuy,String symbol,String filepath) throws IOException 
		{
			int flag=0;
			//OBject array===>to store Java object (JSon to Java)
			ArrayList<Object> listdata = new ArrayList<Object>();
			
			//PresentStock Class object====>to store java object to json
			ArrayList<PresentStock> mainlistdata = new ArrayList<PresentStock>();
			
			//JSONArray jArray = (JSONArray)jsonObject; 
			
			FileReader fils=null;

			try 
			{
				JSONParser jsonparser=new JSONParser();
				
				fils=new FileReader(filepath);

				Object objpar;	
					objpar = jsonparser.parse(fils);
				
				JSONArray jarr=(JSONArray) objpar;
				
				for (Object i: jarr)
				{ 
					JSONObject obj=(JSONObject) i;
					
					String s=obj.toJSONString();
					
					//convert String(of JSON)--->to java as, the ARRAY list(OBJECT type)===>we cannot store JSON object  directly
					PresentStock prd=OopsUtility.convertJsonToJava(s, PresentStock.class);
					     
					//Store javaobject(prd) in the linked list
						   listdata.add(prd); //----ARRAY list is Object type
				} 
				
			/*	for(Object i: jarr)
				{	
					JSONObject obj=(JSONObject) i;
					String s=obj.toJSONString();
					ps prd=OopsUtility.convertJsonToJava(s,ps.class);
					
					//System.out.println(prd);
					if(prd.getStocksymbol().equals(symbol))
					{	
						System.out.println(prd.getTotal());
						
						int total= prd.getTotal()-2;
					
						prd.setTotal(total);
						System.out.println(prd.getTotal());
						System.out.println(prd);
					}
					System.out.println("---------------- */
				
				System.out.println("Before Buying the Stocks Values are:--");
				System.out.println(listdata);
				
				for(int k=0;k<listdata.size();k++)
				{		//System.out.println(k);
						presentstock= (PresentStock) listdata.get(k);
						
						//System.out.println(presentstock);
						
						 if(presentstock.getStocksymbol().equals(symbol))
						 {		
								 if(amount<=presentstock.getTotalvalue())
								 {
									 System.out.println();
									 int n= presentstock.getNosOfShares() - sharesToBuy ;
									 presentstock.setNosOfShares(n);
							
									 mainlistdata.add(presentstock);
									 
									 flag=1;
								 }
								 else
								 {
									 System.out.println("Less amount cannot Buy shares");
									 mainlistdata.add(presentstock);
								 }
						 }
						 else
						 {
							 mainlistdata.add(presentstock);
						 }
				}
				
				//passing the ARRAY LIST directly
				String str=OopsUtility.convertJavaToJson(mainlistdata);
				System.out.println(str);
				
				OopsUtility.filewrite(str,filepath);
			}
			
			catch (FileNotFoundException e)
			{
			// TODO Auto-generated catch block
			e.printStackTrace();
			} 
			catch (ParseException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
			fils.close();
			}
			return flag;
		}

//**********************************************************************************

public static int sell(int sharesToSell,String symbol,String filepath) throws IOException 
{
	int flag=0;
	//OBject array===>to store Java object (JSon to Java)
	ArrayList<Object> listdata2 = new ArrayList<Object>();
	
	//PresentStock Class object====>to store java object to json
	ArrayList<TransactionDetails> mainlistdata2 = new ArrayList<TransactionDetails>();
	
	//JSONArray jArray = (JSONArray)jsonObject; 
	
	FileReader fils=null;

	try 
	{
		JSONParser jsonparser=new JSONParser();
		
		fils=new FileReader("transaction.json");

		Object objpar;	
			objpar = jsonparser.parse(fils);
		
		JSONArray jarr=(JSONArray) objpar;
		
		for (Object i: jarr)
		{ 
			JSONObject obj=(JSONObject) i;
			
			String s=obj.toJSONString();
			
			//convert String(of JSON)--->to java as, the ARRAY list(OBJECT type)===>we cannot store JSON object  directly
			TransactionDetails tds=OopsUtility.convertJsonToJava(s, TransactionDetails.class);
			     
			//Store javaobject(prd) in the linked list
				   listdata2.add(tds); //----ARRAY list is Object type
		} 
		
		System.out.println("Before Selling the Stocks Values are:--");
		System.out.println(listdata2);
		
		for(int k=0;k<listdata2.size();k++)
		{		//System.out.println(k);
				transite= (TransactionDetails) listdata2.get(k);
				
				//System.out.println(presentstock);
				
				 if(transite.getStocksymbol().equals(symbol))
				 {		
						 if(sharesToSell<=transite.getNosOfShares())
						 {
							 System.out.println();
							 int n= transite.getNosOfShares() - sharesToSell;
							 transite.setNosOfShares(n);
					
							 mainlistdata2.add(transite);
							 flag=1;
						 }
						 else
						 {
							 System.out.println("Unsufficient Stock cannot Sell");
							 mainlistdata2.add(transite);
						 }
				 }
				 else
				 {
					 mainlistdata2.add(transite);
				 }
		}
		
		//passing the ARRAY LIST directly
		String str=OopsUtility.convertJavaToJson(mainlistdata2);
		System.out.println(str);
		
		OopsUtility.filewrite(str, filepath);
	}
	
	catch (FileNotFoundException e)
	{
	// TODO Auto-generated catch block
	e.printStackTrace();
	} 
	catch (ParseException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
	fils.close();
	}
	return flag;
}
//**********************************************************************************
	
 
}

/*
ArrayList<String> listdata = new ArrayList<String>();     
JSONArray jArray = (JSONArray)jsonObject; 
if (jArray != null) { 
   for (int i=0;i<jArray.length();i++){ 
    listdata.add(jArray.getString(i));
   } 
} 

[{"Shareprice":50,"Total":1000,"Stocksymbol":"H"},{"Shareprice":100,"Total":1000,"Stocksymbol":"B"},{"Shareprice":25,"Total":750,"Stocksymbol":"J"},{"Shareprice":50,"Total":750,"Stocksymbol":"F"},{"total":587,"stocksymbol":"M","shareprice":66}]
*/

