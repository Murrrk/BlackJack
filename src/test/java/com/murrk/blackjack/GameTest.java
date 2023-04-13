package com.murrk.blackjack;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void testAceValueWhenScoreIsEleven() {
        int score = 11;
        Card card = new Card(Suit.SPADES, Rank.ACE);
        score += Game.valueSelector(card,score);
        assertEquals(12,score);
    }

    @Test
    public void testAceValueWhenScoreIsTen() {
        int score = 10;
        Card card = new Card(Suit.SPADES, Rank.ACE);
        score += Game.valueSelector(card,score);
        assertEquals(21,score);
    }

    @Test
    public void testAceValueWhenScoreIsZero() {
        int score = 0;
        Card card = new Card(Suit.SPADES, Rank.ACE);
        score += Game.valueSelector(card,score);
        assertEquals(11,score);
    }

    @Test
    public void testAceValueWhenScoreIsTwenty() {
        int score = 20;
        Card card = new Card(Suit.SPADES, Rank.ACE);
        score += Game.valueSelector(card,score);
        assertEquals(21,score);
    }
}