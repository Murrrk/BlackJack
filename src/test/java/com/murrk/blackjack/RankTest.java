package com.murrk.blackjack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RankTest {
    @Test
    void getValueOfKingCard() {
        assertEquals(10,Rank.KING.getValue());
    }
}