package org.bridgelabz.objectorientedprogram;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonIgnoreType;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

@JsonDeserialize
@JsonIgnoreType
@JsonIgnoreProperties(ignoreUnknown = true)
public class PresentStock
{
	private int NosOfShares;
	private String Stockname;
	private int Stockprice;
	private String Stocksymbol;
	private int Totalvalue;
	
	public int getNosOfShares() {
		return NosOfShares;
	}
	public void setNosOfShares(int nosOfShares) {
		NosOfShares = nosOfShares;
	}
	public String getStockname() {
		return Stockname;
	}
	public void setStockname(String stockname) {
		Stockname = stockname;
	}
	public int getStockprice() {
		return Stockprice;
	}
	public void setStockprice(int stockprice) {
		Stockprice = stockprice;
	}
	public String getStocksymbol() {
		return Stocksymbol;
	}
	public void setStocksymbol(String stocksymbol) {
		Stocksymbol = stocksymbol;
	}
	public int getTotalvalue() {
		return Totalvalue;
	}
	public void setTotalvalue(int totalvalue) {
		Totalvalue = totalvalue;
	}
	@Override
	public String toString() {
		return "PresentStock [NosOfShares=" + NosOfShares + ", Stockname=" + Stockname + ", Stockprice=" + Stockprice
				+ ", Stocksymbol=" + Stocksymbol + ", Totalvalue=" + Totalvalue + "]";
	}
	
	
			
}
