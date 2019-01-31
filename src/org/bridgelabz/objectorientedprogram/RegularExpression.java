package org.bridgelabz.objectorientedprogram;

import org.bridgelabz.utility.Utility;
import java.util.regex.*; 

public class RegularExpression
{
	public static String replaceMobileNumber(String Sentence1) 
	{
		String replacemobilenumber = "";
		
		System.out.println("Enter Mobilenumber");
		String Mobilenumber = Utility.inputString();
		
		if( Pattern.matches("[0-9]{9}", Mobilenumber))
		{
			 replacemobilenumber = Sentence1.replaceAll("xxxxxxxxxx", Mobilenumber);
		}
		else
		{System.out.println("wrong input");
		}

		return replacemobilenumber;
	}
	
	public static String replaceNameFullName(String Sentence) 
	{
		String replacename=" ", replacenamefullname=" ";
		
		System.out.println("Enter new name");
		String newname = Utility.inputString();
		
		System.out.println("Enter full name");
		String fullname = Utility.inputString();
		
		if( Pattern.matches("[a-zA-Z]*", newname))
		{
		    replacename = Sentence.replaceAll("<<name>>", newname);
		}
		else {System.out.println("wrong input"); }
		
		if( Pattern.matches("[a-zA-Z]*", fullname))
		{	
			replacenamefullname = replacename.replaceAll("<<fullname>>", fullname);
		}
		else {System.out.println("wrong input"); }
		
		System.out.println(replacenamefullname);
		return replacenamefullname;
		
	}
	
	public static String replaceDate(String Sentence2) 
	{
		String replacedate="";
		System.out.println("Enter new date");
		String newdate = Utility.inputString();
		
		if( Pattern.matches("[0-9]{2}/[0-9]{2}/[0-9]{4}", newdate))
		{
		   replacedate = Sentence2.replaceAll("01/01/2016", newdate);
		}
		else {System.out.println("wrong input"); }
		
		return replacedate;
	}
	
	public static void main(String args[])
	{
		String Sentence = "Hello <<name>>, We have your full name as <<fullname>> in our system.";
		
		String Sentence1 = "your contact number is 91-xxxxxxxxxx.";
		
		String Sentence2 = "Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
		
		String fullname =replaceNameFullName(Sentence);
		String mobilenumber = replaceMobileNumber(Sentence1);
		String date = replaceDate(Sentence2);
		
		//String completeSentence = fullname + replacemobilenumber + replacedate;
		

		String completeSentence =  fullname+mobilenumber+date;
		System.out.println(completeSentence);

	}
}
