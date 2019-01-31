
/*********************************************************************************************************
 * @purpose : own Stack created ,stack follow LIFO
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 14-01-2019
 *
 *********************************************************************************************************/

/*
RVD sir write MAX----it is size only

STACK means Noraml Array..with some special method---created like push,pop..etc

Sir given---Array implement in STACK
*/

// HERE i create My own Stack
package org.bridgelabz.datastructure.balanceParanthesis;
public class Mystack 
{
		int size;  //is the SIZE of the ARRAY
		
		Object s[];  //Object array
	
  //####NOTE: STACK-- stack in program[is an array] so start 0 to n-1
	
	//Here tos---->is the pointer to point particular address position int the stack, 
		//if stack empty, initially it is -1 Only 
	int tos= -1;
	
	//Constructor--to take Object Array size
	Mystack(int size)
	{
		this.size=size;
		
		s=new Object[size];
	}
	
	
	/**
	 * to PUSH element into the stack
	 * @param ele : void
	 */
	void push(Object ele)
	{
		if( tos== size-1)    // tos ==size-1 means the {now tos pointer--has reach the TOP of the STACK} 
		{
			System.out.println("Stack overflow");
		}
		else					//for Push
		    ++tos;                   //#1 incerement tos  first then 

	    	s[tos]= ele;			 //#2 store the ele---at new place
	}
	
	
	/**
	 * to check Stack is empty Or not
	 * @return : Boolean
	 */
	boolean isempty()
	{   
		if( tos== -1)
		{
			return true;   // Here 1 ---mean true //stack is empty 
		}
		else
			return false;   // Here 0 ---mean false	
	}

	
	 /**
	  * to POP element into the stack
	  * @return : Object
	  */
     Object pop()
	 { 
		Object z;
		
			    /* Method1 : By using isempty() method
			 
			   		if(isempty() )
			    	{
			    		return -1;  // Here -1 ---mean Dirty value
			    	}
			    
			   OR  MEthod 2 : below    */

				if(tos==-1)
				{
					System.out.println("Stack is empty");
					return false;
				}	
									// FOR	pop
				z= s[tos];				//#1 //take the ele--of the tos 
				tos--;                  //#2  //the decement tos

				return z;				//return the ele
	 }
	
     
     /**
      * to get the TOP element of the stack
      * @return : Object
      */
	 Object stacktop()
	 {
		 if(tos== -1) //condition
		 {
			System.out.println("Stack is empty");
			return false;
		 }	
		
	    return s[tos];			//retutn the Top ele of Stack-->where tos pointing
	 }
	 
	 
	 /**
	  * to display the element of the stack
      * @return : Object
	  */
	 void display()
	 {
		if(tos==-1)
		 {
			System.out.println("Stack is empty");
		 }	
			 
			/**
			 * print every ele os the stack---from TOp to BOTTOM
			 */
			for(int i=0;i<tos;i++)
			{
				System.out.println(s[i] +" ");
			}
	 } 
	 
}
