package org.bridgelabz.datastructure;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class readfile 
{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		
		FileInputStream fos2=null;
		
			ObjectInputStream oos2=null;
	try
	{

		fos2=new FileInputStream("createfile1.ser");
		
		oos2=new ObjectInputStream(fos2);
		
		createfile1 cf=(createfile1)oos2.readObject();
		
		System.out.println(cf);
	}
	
	catch(FileNotFoundException f)
	{
		
	}
	finally
	{
		
		fos2.close();
		oos2.close();
	}
	}
	}
/*
	Output-
	Employee [id=101, password=0, username=a@gmaial.com, email=null]
*/
