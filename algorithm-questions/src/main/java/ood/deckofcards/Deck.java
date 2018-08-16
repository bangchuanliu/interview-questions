package org.ood.deckofcards;

import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards;
	private int dealIndex;
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public int remainingCards() {
		return cards.size() - dealIndex;
	}
	
	public Card dealCard() {
		return cards.get(dealIndex++);
	}
}
