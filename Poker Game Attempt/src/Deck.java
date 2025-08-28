import java.util.*;

class Deck {
    private final List<Card> cards = new ArrayList<>();
    private static final String[] SUITS = { "Hearts", "Diamonds", "Clubs", "Spades" };
    private static final String[] RANKS = { "2","3","4","5","6","7","8","9","10","J","Q","K","A" };

    Deck() {
        for (String s : SUITS) {
            for (String r : RANKS) {
                cards.add(new Card(r, s));
            }
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (cards.isEmpty()) throw new IllegalStateException("Deck is empty!");
        return cards.remove(0);
    }
}
