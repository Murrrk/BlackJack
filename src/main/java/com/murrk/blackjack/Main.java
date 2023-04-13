package com.murrk.blackjack;


public class Main{
    public static void main(String[] args) {
        String playText;

        int score = 0;

        do {
            playText = Game.scan.nextLine();
            Card card = Card.drawCard();
            score += Game.valueSelector(card,score);
            Game.play(card,score,playText);
        }while(Game.mat.matches() && score < 18);
    }
}
