package org.bridgelabz.objectorientedprogram;

import java.util.Arrays;

import org.bridgelabz.datastructure.QueueUsingLinkedListObjecttype;
import org.bridgelabz.utility.Utility;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;


public class DeckOfCardsQueue
{
	public static String[] Deck(String[] suits, String[] cards)
	{
		String[] deck = new String[suits.length * cards.length];

		for (int i = 0; i < cards.length; i++) //"2", "3", "4"
		{
				for (int j = 0; j < suits.length; j++) //"Clubs", "Diamonds"
				{
					deck[suits.length *i+j] = cards[i]+"=>"+suits[j];	//4*0 + 0 = deck[0]
																		//4*1 + 0 = deck[4]
				}
		}

		// shuffle
		for (int i = 0; i < deck.length; i++) 
		{
			int r = i + (int) (Math.random() * (deck.length - i));
			
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		return deck;
	}
	
	/**
	 * @param deck
	 * 
	 * @description This method will distribute the deck of cards into four player.
	 */
	public static void distribute(String[] deck) 
	   {
			String[] Player = new String[12];
			String[] temp= new String[12];
			
			QueueUsingLinkedListObjecttype ql=new QueueUsingLinkedListObjecttype();
			QueueUsingLinkedListObjecttype mainql=new QueueUsingLinkedListObjecttype();
			
			for(int i=0;i<4;i++)
			{
				for (int j=0 ;j<12; j++) 
				{
					Player[j]= deck[i+ j*4];
				}
				
				insertionSortString(Player);
				
				for (int j=0 ;j<12; j++) 
				{	
					ql.insertAtEnd(Player[j]);
				}
			       
				mainql.insertAtEnd(ql);
				
					ql=new QueueUsingLinkedListObjecttype();
			}
			
			for(int j=0;j<4;j++)
			{
				QueueUsingLinkedListObjecttype ql2=(QueueUsingLinkedListObjecttype) mainql.pop();
			
				for (int k=0 ;k<ql2.size(); k++) 
				{
					System.out.print(ql2.pop()+" ,");
				}
				System.out.println("\n"+"-------------------------------------------------");
						
			}
			
			//	System.out.print("\n----------------------------------------------------------------------------------------------------------------------");
			
	   }

	
	public static void main(String[] args) 
	{
		String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};	
		String[] cards = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

		String[] deck = Deck(suits, cards);
		
		System.out.println("Deck OF Cards after suffling : ");
		for (int i = 0; i < deck.length; i++) 
		{
			System.out.print(deck[i] + " ");
		}
		System.out.println("\n");
		distribute(deck);
	}
	
	public static void insertionSortString(String[] arr) 
    { 
        int n = arr.length; 
        
        int i,j;
        
        for (i=0; i<n-1;i++)  
        { 
            String val = arr[i+1]; 
  
            /* Move elements of arr[0..i-1], that are greater than key, to one position ahead of their current position */
         //   if (a[mid].compareTo(x) < 0)
            
           for(j=i;j>=0;j--)
            { 
                if(arr[j].compareTo(val)>0) 
                {
                	arr[j+1] = arr[j];
                }
                else
                	break;
            } 
           
          arr[j+1] = val;
         // printArrayString(arr); 
        } 
    } 
   
}
