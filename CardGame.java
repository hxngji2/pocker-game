package poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import poker.Deck;
import poker.Player;

public class CardGame {
    ArrayList<Card> deck = new ArrayList<>();
    String[] grade = {"No Pair", "1 Pair", "2 Pair"};

    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.Shuffle();

        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        for (int i = 0; i < 5; i++) {
            p1.getCard(deck.deal());
            p2.getCard(deck.deal());
            p3.getCard(deck.deal());
        }

        p1.showCards();
        p2.showCards();
        p3.showCards();

        System.out.println("--------------------------------------");



        System.out.println("Player 1의 결과: ");
        System.out.println("Player 2의 결과: ");
        System.out.println("Player 3의 결과: ");



        }

    }

