package org.bridgelabz.objectorientedprogram;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonIgnoreType;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.exc.*;
//{"Stockname":"Hp","NumbersOfShares":20,"Shareprice":50,"Stocksymbol":"H","Total":1000}

@JsonDeserialize
@JsonIgnoreType
@JsonIgnoreProperties(ignoreUnknown = true)
public class PresentSt implements Serializable
{
		//private String Stockname;
	//	private int NumbersOfShares;
		private int Shareprice;
		private String Stocksymbol;
		private int Total;
		
		
		/*
		public PresentSt()
		{}
		
		
		
		
		public PresentSt(int shareprice, String stocksymbol, int total) {
		
			//NumbersOfShares = numbersOfShares;
			Shareprice = shareprice;
			Total = total;
			Stocksymbol = stocksymbol;
			
			System.out.println(Shareprice);
			
		}

*/


		/*public int getNumbersOfShares() {
			return NumbersOfShares;
		}



		public void setNumbersOfShares(int numbersOfShares) {
			NumbersOfShares = numbersOfShares;
		}*/



		public int getShareprice() 
		{ System.out.println(Shareprice);
			return Shareprice;
		}



		public void setShareprice(int shareprice) {
			Shareprice = shareprice;
			System.out.println(Shareprice);
		}



		public String getStocksymbol() {
			return Stocksymbol;
		}



		public void setStocksymbol(String stocksymbol) {
			Stocksymbol = stocksymbol;
		}



		public int getTotal() {
			return Total;
		}



		public void setTotal(int total) {
			Total = total;
		}

		


		



		@Override
		public String toString() {
			return "PresentSt [Shareprice=" + Shareprice + ", Stocksymbol=" + Stocksymbol + ", Total=" + Total + "]";
		}




		public static void main(String[] args) {
			PresentSt p=new PresentSt();
		//	p.NumbersOfShares=2;
			p.Shareprice=54;
			//p.Stockname="ses";
			p.Stocksymbol="d";
			p.Total=90;
			
			System.out.println(p);
			
		}
		
}
