package com.murrk.blackjack;

import java.util.Scanner;

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
        Scanner scan = new Scanner(System.in);

        String playText = scan.nextLine();
        int score = 0;

        do {
            if(playText.equals("tap"))
            {
                Card card = drawCard();
                System.out.printf("Card: %s%n", card);
                System.out.printf("Card value: %d%n", card.getValue());
                score += card.getValue();
                System.out.printf("Overall score: %d%n", score);

            }
            if(score > 21){
                break;
            }
            playText = scan.nextLine();
        }while (playText.equals("tap"));

    }

    @Override
    public String toString() {
        return this.suit.toString().concat(" ").concat(this.rank.toString());
    }

    public int getValue() {
        return this.rank.getValue();
    }

    public static Card drawCard(){
        return new Card(Suit.drawSuit(),Rank.drawRank());
    }
}
