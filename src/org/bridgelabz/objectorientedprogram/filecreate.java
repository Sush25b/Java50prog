package org.bridgelabz.objectorientedprogram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class filecreate 
{

	public static void main(String[] args) throws IOException
	{
	//here we declare a file---{as a instant }
	FileOutputStream fils=null;
	//FileOutputStream will throw exception---so surrounding try catch
	try
	{
		fils=new FileOutputStream("sush.txt");
	
		//User input from keyboard
		InputStreamReader str=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(str);
		
		System.out.println("enter the content");
	
		String msg=br.readLine();
	//convert string to byte
	//as FileOutputStream support byte by byte input
	//so here we convert string to byte and create 1 byte array
	byte b[]=msg.getBytes();
	//now we pass the byte array
	fils.write(b);
	System.out.println("written successfuly");
	}
	catch (FileNotFoundException e)
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
