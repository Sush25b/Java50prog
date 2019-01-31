package org.bridgelabz.objectorientedprogram;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.bridgelabz.utility.Utility;
import org.bridgelabz.utility.oopsUtility.OopsUtility;

public class StockAccountMain 
{
	public static void main(String[] args) throws IOException 
	{
		int choice;
		TransactionDetails td=new TransactionDetails();
		ArrayList<TransactionDetails> list=new ArrayList<TransactionDetails>();
		String filepath;
		String filewriter;
		
		System.out.println("**********WELCOME**********");
		
		do
		{
			Date date=new Date();
			 SimpleDateFormat formatter=new SimpleDateFormat("dd MM yyyy HH mm SS");  
			String datetime=formatter.format(date);
			 
			 
			System.out.println("\n"+"1] Add NEW Customer \n2] Buy share \n3] Sell share \n4] Save Account to file \n5] printing details of STOCK \n6] Exit");
			System.out.println("enter ur choice");
			 choice= Utility.inputInteger();
			
			switch(choice)
			{
				case 1:
						filepath="customer.json";
					
						System.out.println("create new account for customer");
						StockAccount.AddAccount(filepath);
						break;
				case 2:
						filepath="ps.json";
						filewriter="transaction.json";
					
						System.out.println("enter ur id");
						int id=Utility.inputInteger();
						td.setId(id);
				
						System.out.println("enter ur name");
						String username=Utility.inputStringNext();
						td.setUsername(username);
						
						System.out.println("enter total price$ Amount of share to buy");
						int amount=Utility.inputInteger();
						
						System.out.println("enter the total nos of share to buy");
						int sharesToBuy=Utility.inputInteger();
						
						System.out.println("enter the Stock symbol");
						String symbol=Utility.inputStringNext();
						
						int flag=StockAccount.buy(amount,sharesToBuy,symbol,filepath);

						if(flag==1)
						{
							list.add(new TransactionDetails(id,sharesToBuy,username,symbol,datetime));
						
								String jstr=OopsUtility.convertJavaToJson(list); 
								OopsUtility.filewrite(jstr ,filewriter);
							
								System.out.println("details of the transaction "+jstr);
						}
						break;
						
				case 3:	
						filepath="transaction.json";
						filewriter="transaction.json";
				
						System.out.println("enter ur id");
						int id2=Utility.inputInteger();
						td.setId(id2);
			
						System.out.println("enter ur name");
						String username2=Utility.inputStringNext();
						td.setUsername(username2);
					
						System.out.println("enter the total nos of share to Sell");
						int sharesToSell=Utility.inputInteger();
						td.setNosOfShares(sharesToSell);
						
						System.out.println("enter the Stock symbol");
						String symbol2=Utility.inputStringNext();
						
						int flag2= StockAccount.sell(sharesToSell,symbol2,filepath);
						break;
				case 4:
						System.out.println("save account to file");
						//StockAccount.printStockReport();
						break;
				case 5:
						filepath="ps.json";
						System.out.println("printing details of STOCK and values");
						StockAccount.printReport(filepath);
						break;

				case 6: 
						System.exit(0);		
			}
		}while(choice!=6);
	}
}
