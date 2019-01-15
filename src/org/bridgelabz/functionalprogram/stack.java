/*//Done by RVD sir logic
   //geeksforgeeks also


package org.bridgelabz.functionalprogram; 

 Java implementation to convert infix expression to postfix
// Note that here we use Stack class for Stack operations 

public class stack 
{
   //temporary array to use for Solving
	char[] s=new char[100];

	//tos---means it will always be the Top of the stack 
	int tos=-1;
	
	char ele;
	
	 //push method
	void push(char c) 
    {
		s[++tos]= ele;
	}
	
	int isempty()
	{
		if(tos==-1)
		{
			return 1;
		}
		else
			return 0;
	}
	
   char pop() 
	{
	    char x='$';
		char z;
	    
		if(tos!=-1)
		{
			z= s[tos];
		    tos--;
		    
		    return z;
		}
		return x;
		
	}

	char stacktop()
	{    
		char y='$';
		
		if(tos!=-1)
		{
		    return  s[tos] ;
		}
		
		return y;
	}
	
	    // A utility function to return precedence of a given operator 
	    // Higher returned value means higher precedence 
	    int ipr(char ch) 
	    { 
	        switch (ch) 
	        { 
	            case '^': 
        		     return 3;
              	case '*': 
        	    case '/': 
        	    case '%':
        		     return 2; 
	        	case '+': 
	        	case '-': 
	        		 return 1; 
	        } 
	        return -1; 
	    
	    } 
	  
	   // Lower returned value means lower precedence 
	    int rpr(char ch) 
	    { 
	        switch (ch) 
	        { 
	        	case '*': 
	        	case '/': 
	        	case '%':
	        		return 2; 
	        	case '+': 
	        	case '-':      	
	        		return 1; 
	        	case '(': 
	        		return 0; 
	        } 
	        return -1; 
	    } 

	    
	    //if thier is operand/Character  
	    int isoperand(char ch)
	    {
	    	if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
	    	    return 1;
	    	else
	    		return 0;
	    }
	    
	    
	    // The main method that converts given infix expression to postfix expression
	    String infixToPostfix(char in[],char postfix[]) 
	    { 
	    	int i ,k=0;
	        // initializing empty String for result 
	        String result = ""; 
	        
	        
	          
	      Note 1: By using STACK TO STORE result
	        	
	        				// initializing empty stack 
	        			Stack<Character> stack = new Stack<>(); 
	        	 
	        OR
	        
	      Note 2: OR By using STACK TO STORE result
	        	
       				postfix[] array----to store result
	        	
	        
	        for (i = 0; i<in.length; ++i) 
	        {           
	               
	            // If the character is an '(' then push it to the stack. 
	           if ( in[i] == '(' ) 
	           {
	                push(in[i]); 
	           }
	           
	            //  If the character is an ')' then pop and output from the stack  
	            // until an '(' is encountered. 
	           else 
	        	   if ( in[i] == ')') 
	               { 
	                	while (true) 
	                	{
	                		ele= pop();
	                	
	                		if(ele== '(')
	                		{ 
	                			break;
	                		}
	                		
	                		if(ele== '$')
	                		{ 
	                			break;
	                		}
	                		
	                		postfix[k++]= ele;
	                	}    
	               }
	        	   else
	        		   // If the character is an operand then add it to output. 
	    	           if ( isoperand(in[i])==1 ) 
	    	           {
	    	        	   postfix[k++]= in[i];
	    	           }
	           		   else
	           		       if( isempty()==0 )
	           		       {
	           		    	   push(in[i]);
	           		       } 
	           		       else
	           		    	   if( ipr(in[i]) > ipr(stacktop()) )
	           		    	   {
	           		    		    push(in[i]);
	           		    	   }
	           		    	   else
	           		    	   {
	           		    		   if(stacktop()!='$')
	           		    		   { while( isempty()==0  && ( ipr(in[i])<= ipr(stacktop()) ) )
	           		    		    	{
	           		    		   		   ele=pop();
	           		    		   		   
	           		    		   		    postfix[k++]=ele;	           		    		   		
	           		    		    	}
	           		    		   	push(in[i]);
	           		    		   }
	           		    	   }
	        }   
	         
	     // pop all the operators from the stack 
		 while (	isempty()==0 ) 
		 {
		        ele=pop();
		        postfix[k++]=ele;
		 }
	     
		 //will convert char[] array to string
		 result= String.copyValueOf(postfix);
		        
		 return result; 
 } 
	       
		// Driver method  
	    public static void main(String[] args)  
	    { 
	        String exp= "(a+b)*c";  //#1 //exp length---is 7
	       
	        char[] in= exp.toCharArray();  
	        
	        char[] postfix=new char[ exp.length() ];
	        
	        stack s=new stack();
	        
	        System.out.println(	 s.infixToPostfix(in,postfix)  ); 
	    } 
}*/


