package poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {
    ArrayList<Card> deck = new ArrayList<Card>();

    String[] suit = { "♣︎", "♦︎", "♥︎", "♠︎" };
    String[] number = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

    String[] grade = {"No Pair", "1 Pair", "2 Pair"};

    public Deck() {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < number.length; j++) {
                deck.add(new Card(suit[i], number[j]));
            }
        }
    }

    public void Shuffle() {
        Collections.shuffle(deck);
    }

    public Card deal() {
        return deck.remove(0);
    }

    public void checkCards(){
        for (int i = 0; i < 5 ; i++) {
            for (int j = i+1; j < 5 ; j++) {
                if(number[j].equals(number[j+1])){
                    System.out.println(grade[1]);
                }
            }
        }
    }
}
