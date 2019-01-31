package org.bridgelabz.datastructure;

import org.bridgelabz.datastructure.NodeInt;

public class LinkedlistInteger
{
	NodeInt head ;
	
	public void insertAtBeginning(int data)
	{

		NodeInt node=new NodeInt();
		node.data = data;
		node.next = null;
		
		node.next = head;
		
		head =node;
	}	
	
	public void insertAtEnd(int data)
	{

		NodeInt node=new NodeInt();
		node.data = data;
		node.next = null;
		
		//if the LIST is empty  then insert node---when List is empty
		if(head==null)
		{
			 head=node;
		}
		
		//if LIST is not empty then insert node----at last of the List
		else
		{   
			NodeInt temp= head; //temp node/ n node---point to head node ele;
			
			//in CURRECT LIST--iteration to go to last node 
			while(temp.next!=null)
			{	
				temp=temp.next; //move 1 ele each time  
			}
			
			//now last ele found 
		    temp.next =node; //point CURRECT list last ele---to NEW NODE made & now NEW NODE got added to current list
		    node.next =null;//Now NEW NODE become --last node of CURRENT LIST
	    }
	}
	
	public void insertAfter(int location,int data)
	{
		System.out.println(head.data+"******");
		if(head==null)
		{
			System.out.println("the given previous node is empty");
			return;
		}
		else
		{
			NodeInt node=new NodeInt();
		node.data = data;
		node.next = null;
		
		NodeInt temp = head;
		
		for(int i=0;i<location;i++)
		{	
			 // if the temp.next
	        // temp = node0.next(i.e node 1) 	
			   temp = temp.next; //#1 now temp change
		     
		    if(temp== null)		//#2 so again check temp==null or not
		    { System.out.println("cant insert");
		    }
		}
		node.next= temp.next;
		temp.next= node;
		System.out.println("node inserted");
		}
	}
	
	public void deleteAt(int index)
	{
		if(index==0)
		{
			head = head.next;
		}
		else
		{
			NodeInt temp =head;
			NodeInt n1   =null;
			
			for(int i=0; i < index-1 ;i++)
			{
				temp = temp.next;           //temp--->temp.next
			}
			
			n1 = temp.next;					//n1------>temp.next
			temp.next =n1.next;             //temp.next------->n1.next
			System.out.println("n1"+ n1.data);
			
		}
	}
	public void show()
	{
		NodeInt node= head;
		
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data); //to print last node
	}
	/*public static void main(String[] args) {
	
		Linkedlist list=new Linkedlist();
		list.insertAtEnd(18);
		list.insertAtEnd(19);
		list.insertAfter(0, 21);
		//list.insertAtBeginning(17);
		list.deleteAt();
		list.show();
		
		
	}*/
}
