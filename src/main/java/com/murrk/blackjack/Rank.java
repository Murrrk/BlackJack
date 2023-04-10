package com.murrk.blackjack;

import java.util.Random;

public enum Rank {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private int value;

    private static final Random rng = new Random();

    Rank(int value) {
        this.value = value;
    }

    public int  getValue() {
        return value;
    }

    public static Rank drawRank(){
        Rank[] rank = values();
        return rank[rng.nextInt(rank.length)];
    }
}
