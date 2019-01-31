package org.bridgelabz.objectorientedprogram;

public class Customer 
{
	private String username;
	private int ID;
	private int phoneno;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "Customer [username=" + username + ", ID=" + ID + ", phoneno=" + phoneno + "]";
	}
	
}
