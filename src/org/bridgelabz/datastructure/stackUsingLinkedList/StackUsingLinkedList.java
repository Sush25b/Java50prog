
/*********************************************************************************************************
 * @purpose : STACK is implemented using Linked List and the node data type is integer
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/

package org.bridgelabz.datastructure.stackUsingLinkedList;

//HERE we Create Stack---BY LINKED LIST 
public class StackUsingLinkedList 
{
//*************************************************************************************************************************//	
	//NOTE: STACK-- stack in program[is an array] so start 0 to n-1
	
	//Here head---->is the pointer to point particular address position int the stack, 
		//if stack empty, initially it is -1 Only 
         	//NodeInt head ;
	

	//###NOTE: in LINKED LIST ,initially
		//####NOTE : Head---always initally it is NULL only ,ONLY when the LIST is EMPTY
			//INITIALLY HEAD will point to NULL only 
					//Condition---ONLY when the LIST is EMPTY
	
	//Like the LinkedList program---the method insertAtBeginning is same---ata)
			//Here like--- InsertAtTop 
				//both method have same working ,//### REFER book for it
//*******************************************************************************************************//
	
	//new head node is created
	NodeInt head ;   
	
	//same as public void insertAtEnd(int data)
	
	/**
	 * To insert element in LINKED LIST at the Top 
	 * @param data : ele to be inserted 
	 * @return     : void
	 */
	public void insertAtTop(int data)  //like
	{
		//created a new node--->for LINKDED LISt
		NodeInt node=new NodeInt();
		node.data = data;
		node.next = null;
		
		//if the LIST is empty then insert node by this way---{when List is empty }
		if(head==null)
		{
			 head=node;
		}
		else
		{   
			node.data =data;
			
			node.next = head;
			
			     head = node;
		}
	}		
	
	/**
	 * to display all the elements of Linked list
	 * @return :void
	 */
	public void show()
	{
	  //here new node creted---to point HEAD and ,temp node will traverse to print vals of ele
	  //Node node= head;
		NodeInt temp= head;
		
		while(temp.next!=null) //traverse till  temp.next!=null 
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println(temp.data); //to print last node
	}
}
