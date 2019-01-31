package org.bridgelabz.objectorientedprogram;

public class Deckofcards2D
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
			//OR r =(int) (Math.random() * deck.length);
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
			int indexOfDeck = 0;
			
			String[][] deckOfcard = new String[4][9];
			
			for (int i = 0; i < 4; i++) 
			{
				for (int j = 0; j < 9; j++) 
				{
					deckOfcard[i][j] = deck[indexOfDeck];
					indexOfDeck++;
				}
			}
			
			for (int i = 0; i < 4; i++) 
			{	System.out.print("\n"+"Player "+ (i+1) +" : ");
				
				for (int j = 0; j < 9; j++)
				{
					System.out.print(deckOfcard[i][j] + ", ");
				}
				System.out.print("\n----------------------------------------------------------------------------------------------------------------------");
			}
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
}
