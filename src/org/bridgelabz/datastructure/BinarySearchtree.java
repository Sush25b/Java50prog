
/*********************************************************************************************************
 * @purpose : To find the Nos of Binary Search Tree ----for the Given input
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 1-01-2019
 *
 *********************************************************************************************************/

/* refer--- https://www.geeksforgeeks.org/program-nth-catalan-number/
 * 
 *  What is BST?
 *
 *Total number of possible Binary Search Trees with n different keys 
	(countBST(n)) = Catalan number Cn = (2n)!/(n+1)!*n!

	For n = 0, 1, 2, 3, … values of Catalan numbers are 1, 1, 2, 5, …. So are numbers of Binary Search Trees.

	---------------------------------------------------
	Method 1:

	Recursive Solution-

	Catalan numbers satisfy the following recursive formula.
	Co=1  and C(n+1)=E_n=o to n {Ci*Cn-i}
	--------------------------------------------------------
	* Method 2-
	* 
	* Using Binomial Coefficient 
*/

package org.bridgelabz.datastructure;

import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class BinarySearchtree 
{
//Method 1: Following is the implementation of above recursive formula.
	
	    public static void main(String[] args)
	    { 
	    	int n;		//instant variable--to take i/p from user
	 
			System.out.println("Enter the i/p no for which Number of Binary Search Tree to find\n" );
			n=Utility.inputInteger();
							
             //To find count of BST and  binary trees with n nodes
					//we r calling the method---catalan(n) 
             int answer = Utility.catalan(n); 
           
             // print count of BST for n nodes 
             System.out.println("Count of BST with "+  n +" nodes is "+ answer); 
	    } 
	} 

/*output-
Enter the no for  which Number of Binary Search Tree
5

Count of BST with 5 nodes is 42
*/

/*
 * Method 2-
 * 
 * Using Binomial Coefficient 

We can also use the below formula to find nth catalan number 

	Cn=(1/n+1) {2n to n}
	
	static int binomialCoeff(int n, int k) 
	{ 
		int res = 1; 
       
	//#1 //Condition	
		// Since C(n, k) = C(n, n-k) 
			if (k > n - k) 
			{	k = n - k; 
			}
        
		// Calculate value of  
              // [n*(n-1)*---*(n-k+1)] /  [k*(k-1)*---*1] 
			for (int i = 0; i < k; ++i) 
			{ 
					res =res* (n - i);  
					res =res/ (i + 1); 
			}	 

		return res; 
	}	 
	
	static int Catalan( int n) 
	{ 
	      
	    // Calculate value of 2nCn 
	    int c = binomialCoeff(2 * n, n); 
	  
	    // return 2nCn/(n+1) 
	    return c / (n + 1); 
	} 
	
	
	static int factorial(int n)
	{
		int res = 1; 
	     
		for(int i=1;i<=n;i++)
		{
			res=res*n;
		}
		
		return res;	
	}
	static int binomialCoeff(int n) 
	{ 
		int bino,downval;
		
		downval=(factorial(n+1) * factorial(n));
		
		bino=(factorial(2*n))/downval;
		
		return bino;
	}
	
	static int Catalan( int n) 
	{ 
	      
	    // Calculate value of 2nCn 
	    int c = binomialCoeff(n); 
	  
	    // return 2nCn/(n+1) 
	    return c; 
	} 
	
	static int countBST(int n)
	{
		int count=Catalan(n);
		
		return count;
	} 
		public static void main(String[] args) 
		{  
			int n;
	 
			Scanner sc=new Scanner(System.in);
	 
			System.out.println("Enter the no for  which Number of Binary Search Tree\n" );
					n=sc.nextInt(); 
         
             // find count of BST and  
             // binary trees with n nodes 
             int count1 = countBST(n); 
           
             // print count of BST and  
             // binary trees with n nodes 
             System.out.println("Count of BST with "+  n +" nodes is "+  count1); 
            
         } 
*/
