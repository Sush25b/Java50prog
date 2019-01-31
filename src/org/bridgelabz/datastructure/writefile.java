package org.bridgelabz.datastructure;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.script.ScriptContext;


public class writefile 
{
	//Program no-2
	//here we use program no-1
	
	//here we create a file object—--means here we write in a object file
	public static void main(String[] args) throws IOException
	{
	FileOutputStream fos=null;
	ObjectOutputStream oos=null;
	try
	{
	fos=new FileOutputStream("createfile1.ser");
	oos=new ObjectOutputStream(fos);
	createfile1 cf=new createfile1();
	
	oos.writeObject(cf);
	System.out.println("written");
	}
	catch(FileNotFoundException f)
	{
	}
	finally
	{
	fos.close();
	oos.close();
	}
	
	}
}
