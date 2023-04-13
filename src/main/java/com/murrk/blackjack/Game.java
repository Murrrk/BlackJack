package com.murrk.blackjack;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game {
    protected static final Scanner scan = new Scanner(System.in);
    private static final Pattern pat = Pattern.compile("tap", Pattern.CASE_INSENSITIVE);
    protected static Matcher mat;

    public static int play(Card card, int score, String playText) {
        mat = pat.matcher(playText);
        String endGameText;

        if (mat.matches()) {
            System.out.printf("Card: %s%n", card);
            System.out.printf("Card value: %d%n", valueSelector(card,score));
            System.out.printf("Overall score: %d%n", score);
        }

        if (score > 21) {
            endGameText =  String.format("%nBUSTED!!!!%nYou Lose!!!!%nScore:%d", score);
            System.out.println(endGameText);
        } else if (score >= 18 && score <= 21) {
            endGameText = String.format("YOU WIN!!!!%nScore: %d", score);
            System.out.println(endGameText);
        }
        return score;
    }

    protected static int valueSelector(Card card, int score){
        int value = card.getValue();

        if(value == 1 && score < 11){
            value += 10;
        }else{
            value = card.getValue();
        }

        return value;
    }
}
