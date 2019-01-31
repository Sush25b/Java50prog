
/*********************************************************************************************************
 * @purpose : own Myqueue is implemented, QUEUE follow FIFO
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 13-01-2019
 *
 *********************************************************************************************************/

package org.bridgelabz.datastructure.bankCashCounter;

import java.util.Arrays;

//NOTE: FIFO will happen
public class Myqueue 
{
    int size;
	
	Object s[];		//create object array 
	
	//Here tos---is the pointer where the stack Is ACTUALLY filled, initially it is -1 
			//In queue both rear,front are -1 Only
	int front,rear = -1;
	
	/**
	 * Constructor to initialize the queue size
	 * @param size : size of the array(dequeue)
	 */
	Myqueue(int size)
	{
		this.size=size;
		
		s=new Object[size];
	}
	
	/**
	 * QUEUE FOLLOWS-----FIFO ONly
	 * so to remove element from the Front end 
	 * @return  :  object
	 */
	Object dequeue()
	{   
		if(front==-1)
		{
			System.out.println("Queue is underflow ");
		} 
		
	    Object e= s[front];
	    
	    front++;
		  return e;
	}
	
	/**
	 * QUEUE FOLLOWS-----FIFO ONly
	 * to check if the array(dqueue ) is empty
	 * @return  : boolean
	 */
	boolean isempty()
	{
		if(rear==-1 && front==-1)
		{
			return true;			
			//System.out.println("Queue is empty");
			
		}	
		else 
			return false;	
	}
	
	/**
	 * QUEUE FOLLOWS-----FIFO ONly
	 * to add element from REAR end 
	 * @param o
	 * @return : object
	 */
	boolean enqueue(Object o)
	{
		if(rear==size-1)
		{
			System.out.println("Stack OVERflow");
			return false;
		}
		
		s[++rear]= o;
	    
		   return true;
	}

	/**
	 * print the QUEUE 
	 * @return : String
	 *  
	 */
    public String toString()
    {
		return "Myqueue [size=" + size + ", s=" + Arrays.toString(s) + ", front=" + front + ", rear=" + rear + "]";
	}	
}
