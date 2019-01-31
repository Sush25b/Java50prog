

package org.bridgelabz.objectorientedprogram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.bridgelabz.utility.Utility;
import org.bridgelabz.utility.oopsUtility.OopsUtility;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class CustomerInformation
{
		public static void main(String[] args) throws IOException 
		{
			FileReader fils=null;	
			String t="";
			
			Customer cust=new Customer();
			
			int flag=1;
				
			while(flag==1)
			{	   
				
					System.out.println("enter username");
					String username=Utility.inputStringNext();
					cust.setUsername(username);
					
					System.out.println("enter Customer Id ");
					int ID=Utility.inputInteger();
					cust.setID(ID);
				
					System.out.println("enter Customer phone no ");
					int phoneno=Utility.inputInteger();
					cust.setPhoneno(phoneno);
					
					System.out.println("Adding new Customer");
					
					//String m=OopsUtility.convertJavaToJson(cust);
					//System.out.println(m); 
					try
					{
						fils=new FileReader("customer.json");
						
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
							String str=OopsUtility.convertJavaToJson(cust);
							
							for (int i = 0;i <jarr.size(); i++)
							{
									t=t+jarr.get(i)+",";
							}
							
							t = "["	+ 	t	+ str +"]";
							System.out.println("writing...");
						}
						OopsUtility.filewrite(t,"customer.json");
						
					System.out.println("Do you want to add More Customer... press 1");
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




