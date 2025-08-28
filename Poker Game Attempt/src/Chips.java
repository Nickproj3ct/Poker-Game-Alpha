class Chips {

    // Distribute winnings to the winner using their multiplier
    public static void payout(Player winner, int pot, int multiplier) {
        int winnings = pot * multiplier;
        System.out.println(winner.name + " wins " + winnings + " chips!");
        winner.win(winnings);
    }
}

