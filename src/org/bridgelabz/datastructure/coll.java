package org.bridgelabz.datastructure;

import java.util.ArrayDeque;
import java.util.Scanner;

public class coll 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	
	ArrayDeque <Integer> list=new ArrayDeque <Integer>();
	//integer only
	System.out.println("enter the elements--to add from head");
	
	for(int i=0;i<=4;i++)
	{
	  list.addFirst(sc.nextInt());
	}
	System.out.println(list); //----display the object
	
}}
