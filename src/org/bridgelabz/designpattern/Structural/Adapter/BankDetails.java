package org.bridgelabz.designpattern.Structural.Adapter;

public class BankDetails
{
	 private String bankName;
	 private String accHolderName;
	 private long AccNumber;
	 
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public long getAccNumber() {
		return AccNumber;
	}
	public void setAccNumber(long accNumber) {
		AccNumber = accNumber;
	}
	 
	 
}
