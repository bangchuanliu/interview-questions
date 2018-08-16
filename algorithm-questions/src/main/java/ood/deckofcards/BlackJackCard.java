package org.ood.deckofcards;

public class BlackJackCard extends Card{

	public BlackJackCard(Suit suit, int faceValue) {
		super(suit, faceValue);
	}

	@Override
	public int value() {
		if (faceValue > 10 && faceValue <= 13) {
			return 10;
		}
		
		return faceValue;
	}

}
