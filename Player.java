package poker;

import java.util.ArrayList;

public class Player {
    ArrayList<Card> card = new ArrayList<Card>();
    ArrayList<Card> deck = new ArrayList<Card>();
    String[] grade = {"No Pair", "1 Pair", "2 Pair"};


    public void getCard(Card card) {
        this.card.add(card);

    }

    public void showCards() {
        System.out.println(card);
    }


}
