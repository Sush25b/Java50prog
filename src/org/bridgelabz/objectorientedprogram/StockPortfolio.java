package org.bridgelabz.objectorientedprogram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.bridgelabz.utility.Utility;
import org.bridgelabz.utility.oopsUtility.OopsUtility;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


//to add stock
public class StockPortfolio 
{
		public static void main(String[] args) throws IOException 
		{
			FileReader fils=null;	
			String t="";
			
				PresentStock pts=new PresentStock();
			
			String filepath="ps.json";
				
			int flag=1;
				
			while(flag==1)
			{	   
				
					System.out.println("enter Nos of Shares");
					int NosOfShares=Utility.inputInteger();
					pts.setNosOfShares(NosOfShares);
				
					System.out.println("enter Stock name");
					String name=Utility.inputStringNext();
					pts.setStockname(name);
					
					System.out.println("enter stock price ");
					int shareprice=Utility.inputInteger();
					pts.setStockprice(shareprice);
				
					System.out.println("enter stock symbol");
					String symbol=Utility.inputStringNext();
					pts.setStocksymbol(symbol);
					
					System.out.println("Calculating stock value total");
					int totalvalue= pts.getNosOfShares() * pts.getStockprice();
					pts.setTotalvalue(totalvalue);
					
					System.out.println("Adding new Stock");
					
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
							t=openbracket+OopsUtility.convertJavaToJson(pts)+closebracket;
						}
						else
						{
							String str=OopsUtility.convertJavaToJson(pts);
							
							for (int i = 0;i <jarr.size(); i++)
							{
									t=t+jarr.get(i)+",";
							}
							
							t = "["	+ 	t	+ str +"]";
							System.out.println("writing...");
						}
						OopsUtility.filewrite(t,filepath);
						
					System.out.println("Do you want to add More Stock press 1");
					flag=Utility.inputInteger();	
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
			  }
		}	
}

