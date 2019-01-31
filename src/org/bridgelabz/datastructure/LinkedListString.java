package org.bridgelabz.datastructure;

public class LinkedListString 
{
		Node head;
	
	//###NOTE: in LINKED LIST ,initially
	//####NOTE : Head---always initally it is NULL only ,ONLY when the LIST is EMPTY
		//INITIALLY HEAD will point to NULL only 
				//Condition---ONLY when the LIST is EMPTY
		
	public void insertAtBeginning(String data)
	{  
		
		Node node=new Node();
		node.data = data;
		node.next = null;
		
		node.next = head;
		
		head =node;
	}	
	
	public void insertAtEnd(String data)
	{

		Node node=new Node();
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
			Node temp= head; //temp node/ n node---point to head node ele;
			
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
	
	public void insertAfter(int location,String data)
	{
		System.out.println(head.data+"******");
		if(head==null)
		{
			System.out.println("the given previous node is empty");
			return;
		}
		else
		{
		Node node=new Node();
		node.data = data;
		node.next = null;
		
		Node temp = head;
		
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
	
	//if index Number---is passed
	public void deleteAtIndex(int index)
	{
		if(index==0)
		{
			head = head.next;
		}
		else
		{
			Node temp =head;
			Node n1   =null;
			
			for(int i=0; i < index-1 ;i++)
			{
				temp = temp.next;           //temp--->temp.next
			}
			
			n1 = temp.next;					//n1------>temp.next
			temp.next =n1.next;             //temp.next------->n1.next
			System.out.println("n1"+ n1.data);
			
		}
	}
	
	//if String---is passed
	public void deleteAt(String item)
	{
		Node temp =head;		//n
	    Node prev =null;		//n1
		
				if(temp!= null && temp.data.equals(item))
				{
					head=temp.next;
					System.out.println("item deleted");
					return;
				}	
		
		while (temp != null) 
        { 
			if(temp.data.equals(item))
			{
				// Unlink the node from linked list 
				prev.next = temp.next;
				System.out.println("item deleted");
				return;
			}
			System.out.println("----------");
            prev = temp; 
            temp = temp.next; 
            
        }   
		
			// If key was not present in linked list 
	        if (temp != null) 
	        {	System.out.println("item not found");
	        	return; 
    	       }
	}
	
	
	public int search(String item)
	{
		int flag=0;
		Node temp;
			
		temp=head;
		
			if(head==null) //OR temp==null
			{
				System.out.println("list is empty");
			}
			else
			{
					while(temp!=null)
					{
							if(temp.data.equals(item))
							{
								System.out.println("item found");
								return flag=0;
							}
							else
							{
								flag=1;
							}
						 temp = temp.next;
					}
					
				if(flag==1)
				{
					System.out.println("item not found");
					return flag=1;
				}
			}
			
			return flag;
	}
	
	public void show()
	{
	  //here new node creted---to point HEAD and node will traverse to print vals of ele
	  //Node node= head;
		Node temp= head;
		
		while(temp.next!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data); //to print last node
	}
}
