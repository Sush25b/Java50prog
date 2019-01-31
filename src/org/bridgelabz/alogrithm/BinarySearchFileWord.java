
/*********************************************************************************************************
 * @purpose : to find the prime numbers that are Anagram and Palindrome 
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/
package org.bridgelabz.alogrithm;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class BinarySearchFileWord 
{
	

	public static void main(String[] args) throws IOException
	{
		FileInputStream fils=new FileInputStream("Sushantfile");
		char word[]=new char[100];
		
		try {
	    	 
	   	     int i=0,j=0; 
	    	 
	    	    while(i!=-1)
	    	    {
	    	       ++j;
	    	      
	    	       i=fils.read();
	
	    	        word[j]=(char)i;
	    	    }
	    	    
	    	   for(int k=0;k<=100;k++)
	    	   {
	    		   System.out.println(word[j]+",");
	    	   }

	        }
	     catch(FileNotFoundException e)
	     {
	    	 	e.printStackTrace();
	     }
	     finally {
	    	 fils.close();
	     }
	
	}
}
