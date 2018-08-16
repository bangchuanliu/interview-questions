package org.ood.deckofcards;

import java.util.List;

public abstract class Hand {
	
	private List<Card> cards;

	public void getOneCard(Card card) {
		cards.add(card);
	}
	
	public int score() {
		int score = 0;
		
		for (Card card : cards) {
			score += card.value();
		}
		return score;
	}
}
