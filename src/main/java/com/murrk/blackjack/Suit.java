package com.murrk.blackjack;

import java.util.Random;

public enum Suit {
    CLUBS('\u2663'),
    DIAMONDS('\u2666'),
    HEARTS('\u2665'),
    SPADES('\u2660');

    private char symbol;
    private static final Random rng = new Random();

    Suit(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return Character.toString(this.symbol);
    }

    public static Suit drawSuit(){
        Suit[] suit = values();
        return suit[rng.nextInt(suit.length)];
    }
}
