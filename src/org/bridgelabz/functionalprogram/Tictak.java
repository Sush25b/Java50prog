/*********************************************************************************************************
 * @purpose : Tic Tac game 
 * 
 * @author  : Sushant Phulsundar
 * 
 *@version  : 1.0 
 *
 *@since    : 10-01-2019
 *
 *********************************************************************************************************/


package org.bridgelabz.functionalprogram;

import java.util.Random;
import java.util.Scanner;

import org.bridgelabz.utility.Utility;

public class Tictak 
{
	int i,j;
	// arr[i][j]+" "
	
	void display(char arr[][])
	{
		for(i=0;i<3;i++)
		{
			for( j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+"|");
			}
			System.out.println();
		}
	}
	 
	void insertsymbol(char arr[][])
	{
		for(i=0;i<3;i++)
		{
			for( j=0;j<3;j++)
			{
				arr[i][j]='-';
			}
			System.out.println();
		}
	}
	
	static int isempty(char arr[][])
		{
		   int i,j,k;
			for(i=0;i<3;i++)
			{
				for( j=0;j<3;j++)
				{
					if(arr[i][j]!='\u0000')
					{	
					return 0;
					}
				}
			}
			return 1;
		}
	 
	boolean result(char arr[][])
	{
		if(arr[0][0]=='X'&& arr[0][1]=='X'&&arr[0][2]=='X')
		{
			System.out.println("user won");
			return true;
		}
		if(arr[1][0]=='X'&& arr[1][1]=='X'&&arr[1][2]=='X')
		{
			System.out.println("user won");
			return true;
		}
		if(arr[2][0]=='X'&& arr[2][1]=='X'&&arr[2][2]=='X')
		{
			System.out.println("user won");
			return true;
		}
		if(arr[0][0]=='X'&& arr[1][0]=='X'&&arr[2][0]=='X')
		{
			System.out.println("user won");
			return true;
		}
		if(arr[0][1]=='X'&& arr[1][1]=='X'&&arr[2][1]=='X')
		{
			System.out.println("user won");
			return true;
		}
		if(arr[0][2]=='X'&& arr[1][2]=='X'&&arr[2][2]=='X')
		{
			System.out.println("user won");
			return true;
		}
		if(arr[0][0]=='X'&& arr[1][1]=='X'&&arr[2][2]=='X')
		{
			System.out.println("user won");
			return true;
		}
		if(arr[0][2]=='X'&&arr[1][1]=='X'&&arr[2][0]=='X')
		{
			System.out.println("user won");
			return true;
		}

		return false;
	}
	 
	boolean result2(char arr[][])
	{
		if(arr[0][0]=='0'&& arr[0][1]=='0'&&arr[0][2]=='0')
		{
			System.out.println("Computer won");
			return true;
		}
		if(arr[1][0]=='0'&& arr[1][1]=='0'&&arr[1][2]=='0')
		{
			System.out.println("Computer won");
			return true;
		}
		if(arr[2][0]=='0'&& arr[2][1]=='0'&&arr[2][2]=='0')
		{
			System.out.println("Computer won");
			return true;
		}
		if(arr[0][0]=='0'&& arr[1][0]=='0'&&arr[2][0]=='0')
		{
			System.out.println("Computer won");
			return true;
		}
		if(arr[0][1]=='0'&& arr[1][1]=='0'&&arr[2][1]=='0')
		{
			System.out.println("Computer won");
			return true;
		}
		if(arr[0][2]=='0'&& arr[1][2]=='0'&&arr[2][2]=='0')
		{
			System.out.println("Computer won");
			return true;
		}
		if(arr[0][0]=='0'&& arr[1][1]=='0'&&arr[2][2]=='0')
		{
			System.out.println("Computer won");
			return true;
		}
		if(arr[0][2]=='0'&&arr[1][1]=='0'&&arr[2][0]=='0')
		{
			System.out.println("Computer won");
			return true;
		}

		return false;
	}
	 
	 
	public static void main(String[] args)
	{
	
		 Tictak t=new  Tictak();
		 
		int x,y;
	
		char[][] arr=new char[3][3];
		
		t.insertsymbol(arr);
		
		while(true)
		{
			boolean b=true;
			Utility utility = new Utility();
			
			Random ramno=new Random(); 
			
			System.out.println("\n"+"Computer turn to play");
			while(b)
			{	x=ramno.nextInt(3);
		
				y=ramno.nextInt(3);
			
			    System.out.println("computer choose position----"+" "+x+" ,"+y);
				if(arr[x][y]=='-')
			    {
			    	arr[x][y]='0';
			    	b=false;
			    }
				
			}
			t.display(arr);
			
			
			if(t.result2(arr)==true)
			{
				System.out.println("******Computer Won*********");
				System.exit(0);
			}
			else 
				{
				  System.out.println("false");
				}
			
			//if(t.result(arr)!= false)
			//{
			//	      t.display(arr);
			//}
			
			//=======================================================================================
			boolean a=true;
			
			    while(a) 
				{	
					System.out.println("\n"+"USer turn to play");
					System.out.println("select a Co-ordinate to put----- X");
					
					System.out.print("Enter x value:");
					x = Utility.inputInteger();
					
					System.out.print("Enter y value:");
					y = Utility.inputInteger();
					
				   if(arr[x][y]=='-')
				   {
				    	arr[x][y]='X';
				    	a=false;
				   }
				  else
				  	System.out.println("already filled put again");  	
				} 
				
				t.display(arr);
				    	
				if(t.result(arr)==true)
				{
					System.out.println("******User Won*********");
					System.exit(0);
				}
				else 
					{
					  System.out.println("false");
					}
				
				
			//===========================================================================
				
		    int result=isempty(arr);
		    if(result==1)
		    {
		    	System.out.println("match drawn");
		    	System.exit(0);
		    }
				
				
		}
	}
}




