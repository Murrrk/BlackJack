package com.murrk.blackjack;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card(String suit, String rank){
        this.suit = Suit.valueOf(suit.toUpperCase());
        this.rank = Rank.valueOf(rank.toUpperCase());
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public static void main(String[] args) {
        System.out.println(drawCard());
        System.out.println(drawCard().getValue());

    }

    @Override
    public String toString() {
        return this.suit.toString().concat(" ").concat(this.rank.toString());
    }

    public int getValue() {
        return this.rank.getValue();
    }

    public static Card drawCard(){
        Card card = new Card(Suit.drawSuit(),Rank.drawRank());
        return card;
    }
}
