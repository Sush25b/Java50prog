package org.bridgelabz.datastructure;

import java.io.Serializable;

public class createfile1 implements Serializable //Serialization converts
//the object state to serial bytes to send/store in network
{

	String s="sushant suresh ramesh";

	public String getS() {
		return s;
	}

	public void setS(String s) 
	{
		this.s = s;
	}

	@Override
	public String toString() {
		return "createfile1 [s=" + s + "]";
	}
	
}
