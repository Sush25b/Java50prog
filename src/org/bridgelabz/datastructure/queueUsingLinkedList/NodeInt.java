
/*********************************************************************************************************
 * @purpose : Node class to create NODE for LINKED LIST of INTEGER TYPE
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 15-01-2019
 *
 *********************************************************************************************************/

package org.bridgelabz.datastructure.queueUsingLinkedList;

//##NOTE: NODE class to make object of NODE class--->different nodes of Linked List
public class NodeInt <T>
{
	T data ;		//the Node data
	NodeInt next;   //the Node refernce---->it will store address of next node 

	/**
	 * Constructor : to initialize the value
	 */
	public NodeInt()
	{
		this.data= data;
		this.next= null;
	}
}
