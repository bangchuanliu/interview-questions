package org.ood.deckofcards;

public enum Suit {
	HEART(0),

	DIAMOND(1),

	SPADE(2),

	CLUB(3);

	private int value;

	Suit(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public Suit getSuitByValue(int value) {
		Suit suit;
		switch (value) {
		case 0:
			suit = Suit.HEART;
			break;
		case 1:
			suit = Suit.DIAMOND;
			break;
		case 2:
			suit = Suit.SPADE;
			break;
		case 3:
			suit = Suit.CLUB;
			break;
		default:
			throw new RuntimeException();
		}

		return suit;
	}
}
