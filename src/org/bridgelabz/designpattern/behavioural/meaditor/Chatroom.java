package org.bridgelabz.designpattern.behavioural.meaditor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

interface Chat
{
	public void showMessage(String msg,Participant  p);
	
}

public class Chatroom implements Chat
{
	Date date=new Date();
	DateFormat dateformat=new SimpleDateFormat("DD MM YYYY HH MM SS");
	
	public void showMessage(String msg,Participant p)
	{
		System.out.println(p.getName()+"'gets message: "+msg);  
        System.out.println("\t\t\t\t"+"["+dateformat.format(date).toString()+"]");    
	}
}
