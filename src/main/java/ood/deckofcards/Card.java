package org.ood.deckofcards;

public abstract class Card {
	
	private Suit suit;
	
	protected int faceValue;
	
	private boolean available;
	
	public Card(Suit suit, int faceValue) {
		this.suit = suit;
		this.faceValue = faceValue;
	}
	
	public abstract int value();

	public Suit getSuit() {
		return suit;
	}

	public int getFaceValue() {
		return faceValue;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
