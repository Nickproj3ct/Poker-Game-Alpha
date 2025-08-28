

import java.util.*;

class Player {
    final String name;
    final List<Card> hand = new ArrayList<>();
    private int chips;

    Player(String name, int startingChips) {
        this.name = name;
        this.chips = startingChips;
    }

    void drawCard(Deck deck) {
        hand.add(deck.draw());
    }

    void showHand() {
        System.out.println(name + "'s hand: " + hand + " (Chips: " + chips + ")");
    }

    public int getChips() {
        return chips;
    }

    public void bet(int amount) {
        if (amount > chips) {
            throw new IllegalArgumentException(name + " doesn’t have enough chips!");
        }
        chips -= amount;
    }

    public void win(int amount) {
        chips += amount;
    }
}
