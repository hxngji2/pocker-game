package poker;

public class Card {
    String suit;
    String number;

    public Card(String suit, String number) {
        this.suit = suit;
        this.number = number;
    }

    @Override
    public String toString() {
        return "(" + suit + " " + number + ")";
    }


}
