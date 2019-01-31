package org.bridgelabz.objectorientedprogram;

public class TransactionDetails 
{
	private int id;
	private int NosOfShares;
	private String Username;
	private String Stocksymbol;
	private String date;
	
	public TransactionDetails() {
	}

	public TransactionDetails(int id, int nosOfShares, String username, String stocksymbol,String date)
	{
		super();
		this.id = id;
		NosOfShares = nosOfShares;
		Username = username;
		Stocksymbol = stocksymbol;
		this.date = date;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNosOfShares() {
		return NosOfShares;
	}
	public void setNosOfShares(int nosOfShares) {
		NosOfShares = nosOfShares;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getStocksymbol() {
		return Stocksymbol;
	}
	public void setStocksymbol(String stocksymbol) {
		Stocksymbol = stocksymbol;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "TransactionDetails [id=" + id + ", NosOfShares=" + NosOfShares + ", Username=" + Username
				+ ", Stocksymbol=" + Stocksymbol + ", date=" + date + "]";
	}
	
	

}
