
/*********************************************************************************************************
 * @purpose :  own MyDEueue is implemented ,Deque follow both side insert an delete
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/

package org.bridgelabz.datastructure.palindromeChecker;

import java.util.Arrays;

public class MyDeque 
{
	 int size;	//size of the DEQUE
		
		Object s[];		//create object array 
		
		//Here tos---is the pointer where the stack Is ACTUALLY filled, initially it is -1 
				//In queue both rear,front are -1 Only
		int front,rear = -1;
		
		/**
		 * Constructor to initialize the queue size
		 * @param size : size of the array(dequeue)
		 */
		MyDeque(int size)
		{
			this.size=size;
			
			s=new Object[size];
		}
		
	//888888888888888888888888888888	front SIDE	88888888888888888888888888888888888888888888888	
		/**
		 * DEQUEUE FOLLOWS-----insert both end & remove from both end 
		 * to add element from FRONT end 
		 * @param o
		 * @return : object
		 */
		boolean frontenqueue(Object o)
		{
			if(isempty())
			{
				System.out.println("Stack underflow");
				return false;
			}
			
			if(front-1>=0)   //as arr start index is----0 , so front should not exceed 0
			{
				s[front-1]= o;
				
				front--;     
				return true;
			}
			
		   return false;
		}
		
		/**
		 * DEQUEUE FOLLOWS-----insert both end & remove from both end 
		 * so to remove element from the Front end 
		 * @return  :  object
		 */
		Object frontdequeue() //remove element from front //here
		{   
			if(front==-1)
			{
				System.out.println("Queue is underflow ");
			} 
			
		    Object e= s[front];
		    
		    front++;
			  return e;
		}
		
	//888888888888888888888888888888	isempty	88888888888888888888888888888888888888888888888	
		
		/**
		 * DEQUEUE FOLLOWS-----insert both end & remove from both end 
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
		 * DEQUEUE FOLLOWS-----insert both end & remove from both end 
		 * to add element from REAR end 
		 * @param o
		 * @return : object
		 */
		
	//888888888888888888888888888888	REAR SIDE	88888888888888888888888888888888888888888888888	
		
		/**
		 * DEQUEUE FOLLOWS-----insert both end & remove from both end 
		 * to add element from REAR side
		 * @param o: Object passed
		 * @return : object
		 */
		boolean rearenqueue(Object o)
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
		 * DEQUEUE FOLLOWS-----insert both end & remove from both end 
		 * so to remove element from the Front end 
		 * @return  :  object
		 */
		Object reardequeue() //remove element from front //here
		{   
			if(rear==-1)
			{
				System.out.println("Queue is underflow ");
			} 
			
		    Object e= s[rear];
		    
		    rear--;
		    
			  return e;
		}

		/**
		 * print the DEQUEUE 
		 * @return : String
		 *  
		 */
	    public String toString()
	    {
			return "Myqueue [size=" + size + ", s=" + Arrays.toString(s) + ", front=" + front + ", rear=" + rear + "]";
		}
}
