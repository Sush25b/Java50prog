package org.bridgelabz.datastructure.unorderedList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.bridgelabz.utility.Utility;

public class UnOrderedlist 
{
	/*class Node		//node ka class
	{
		Object data;  //Object Class----ka object ka reference
		Node next;    //#Object1 //Node Class----ka object ka reference
		
		public Node(Object data)   //Constructor---to create node
		{
			this.data=data; 
		}
		
	}
	
	//Here we use Head variable to store The {1st Object}----ka address 
	private Node head;   //#Object2 //Node Class----ka object ka reference
	
	boolean add(Object data)
	{
		//System.out.println("add function "+data);
		Node n=new Node(data); 	//create a object---n of node class
		*/
	
		public static void main(String[] args) throws IOException
		{
				//here we declare a file---{as a instant }
				FileReader fils=null; //FileOutputStream will throw exception---so surrounding try catch
			
				LinkedListString list=new LinkedListString();
			
				String word="";
				
				try
				{
						fils=new FileReader("/home/bridgeit/eclipse-workspace/sushant.txt");
						BufferedReader br=new BufferedReader(fils);  
						
					String str= br.readLine();
						
					String s[] =str.split(" ");
						
				//Printing the ele---stored in the String ARRAY
				System.out.println("the elements of String Array---:");
						for(int i=0;i<s.length;i++)
						{
							System.out.println(s[i]);
						}
					
				//Adding ele into the list----LinkedList
						for(int i=0;i<s.length;i++)
						{
							list.insertAtEnd( s[i] );
						}
						
				System.out.println("\n"+"Enter the word to be searched ");
						word= Utility.inputString();
						
				//Calling method---to search Word in the lINKEDlIST
				int flag=list.search(word);
				   
					if(flag==0) //0----means item found
					{
						list.deleteAt(word);
					}
						
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}
				finally
				{
					fils.close();
				}
	}
}
