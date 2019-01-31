
/*********************************************************************************************************
 * @purpose : Queue is implemented using Linked List and the node data type is Integer
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/


package org.bridgelabz.datastructure.queueUsingLinkedList;

public class QueueUsingLinkedList<T>
{
	NodeInt front;
	NodeInt rear;
	
	//###NOTE: in LINKED LIST ,initially
			//####NOTE : Head---always initally it is NULL only ,ONLY when the LIST is EMPTY
				//INITIALLY HEAD will point to NULL only 
						//Condition---ONLY when the LIST is EMPTY
		
		//Like the LinkedList program---the method insertAtBeginning is same---ata)
				//Here like--- InsertAtTop 
					//both method have same working ,//### REFER book for it
		
		
		//public void insertAtBeginning(int data)
		
		public void insertAtEnd(T data)  //like
		{
			
			NodeInt node=new NodeInt();
			node.data = data;
			node.next = null;
			
				//if the LIST is empty  then insert node---when List is empty
				if(front==null)
				{
					 front=node;
					 rear =node;
					 
					 node.next= null;	/*same as---another way
					 						front.next= null;
					 					     rear.next= null;
					 					*/
				}
				else
				{   
				//here i.e rear++
					rear.next = node;  //#1 //joining the rear--pointed ele  with
												//to the new node
					     rear = node;  //#2 //then {change---rear} , point the rear to the node 
					
				    node.next = null;  //#3 //now point the new node.next to NULL
				}
		}		
		
		public Object pop()
		{
			Object z=0;
			
			NodeInt temp;
			
			if(front==null)
			{
				System.out.println("Queue underflow");
			}
			else
			{
				 z=front.data;
				 
				 front=front.next;
				
			}
			return z;
		}
		

		public void show()
		{
			NodeInt temp;
			
			temp= front;
			
				if(front== null)
				{
					 System.out.println("QUeue is empty");
				}
				else
				{
					System.out.println("printitng the elements of Queue");
					while(temp!= null)
					{
						System.out.println(temp.data+" ");
						temp =temp.next;
					}
				}
		}	
		
}
