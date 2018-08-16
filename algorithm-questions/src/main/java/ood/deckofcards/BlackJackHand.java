package org.ood.deckofcards;

public class BlackJackHand extends Hand{
	
	public boolean isBusted() {
		return score() > 21;
	}
	
	public boolean is21() {
		return score() == 21;
	}
}
