class Card {
    final String suit;  
    final String rank;  

    Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    int rankValue() {
        switch (rank) {
            case "J": return 11;
            case "Q": return 12;
            case "K": return 13;
            case "A": return 14;
            default:  return Integer.parseInt(rank);
        }
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
