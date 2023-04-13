package com.murrk.blackjack;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return this.suit.toString().concat(" ").concat(this.rank.toString());
    }

    protected int getValue() {
        return this.rank.getValue();
    }

    public static Card drawCard(){
        return new Card(Suit.drawSuit(),Rank.drawRank());
    }
}
