// Imports preset tools
import java.util.*;

// Evaluate hand for ranking
class PokerHandEvaluator {

    public static HandResult evaluate(List<Card> hand) {
        if (hand.size() != 5) throw new IllegalArgumentException("Hand must have 5 cards.");

// Possible Hands (add more as needed)
        boolean isFlush = isFlush(hand);
        boolean isStraight = isStraight(hand);
        int maxCount = maxOfAKind(hand);
        boolean hasThree = hasCount(hand, 3);
        int pairCount = countPairs(hand);

        if (isStraight && isFlush && isRoyal(hand)) {
            return new HandResult("Royal Flush", 100, 9);
        }
        if (isStraight && isFlush) {
            return new HandResult("Straight Flush", 50, 8);
        }
        if (maxCount == 4) {
            return new HandResult("Four of a Kind", 25, 7);
        }
        if (hasThree && pairCount == 1) {
            return new HandResult("Full House", 10, 6);
        }
        if (isFlush) {
            return new HandResult("Flush", 6, 5);
        }
        if (isStraight) {
            return new HandResult("Straight", 4, 4);
        }
        if (hasThree) {
            return new HandResult("Three of a Kind", 3, 3);
        }
        if (pairCount == 2) {
            return new HandResult("Two Pair", 2, 2);
        }
        if (pairCount == 1) {
            return new HandResult("One Pair", 2, 1);
        }
        return new HandResult("High Card", 1, 0);
    }

    // failsafes, boolean, handrates

    private static boolean isFlush(List<Card> hand) {
        String suit0 = hand.get(0).suit;
        for (Card c : hand) {
            if (!c.suit.equals(suit0)) return false;
        }
        return true;
    }

    private static boolean isStraight(List<Card> hand) {
        List<Integer> ranks = ranksSorted(hand);
        for (int i = 1; i < ranks.size(); i++) {
            if (Objects.equals(ranks.get(i), ranks.get(i - 1))) return false;
        }
        boolean normal = true;
        for (int i = 1; i < ranks.size(); i++) {
            if (ranks.get(i) != ranks.get(i - 1) + 1) { normal = false; break; }
        }
        if (normal) return true;

        if (ranks.get(4) == 14) {
            List<Integer> alt = new ArrayList<>(ranks);
            alt.remove(4);
            alt.add(0, 1);
            for (int i = 1; i < alt.size(); i++) {
                if (alt.get(i) != alt.get(i - 1) + 1) return false;
            }
            return true;
        }
        return false;
    }

    private static boolean isRoyal(List<Card> hand) {
        Set<Integer> set = new HashSet<>();
        for (Card c : hand) set.add(c.rankValue());
        return set.containsAll(Arrays.asList(10, 11, 12, 13, 14));
    }

    private static int maxOfAKind(List<Card> hand) {
        Map<Integer, Integer> freq = rankFrequencies(hand);
        int max = 0;
        for (int count : freq.values()) max = Math.max(max, count);
        return max;
    }

    private static boolean hasCount(List<Card> hand, int target) {
        Map<Integer, Integer> freq = rankFrequencies(hand);
        for (int count : freq.values()) if (count == target) return true;
        return false;
    }

    private static int countPairs(List<Card> hand) {
        Map<Integer, Integer> freq = rankFrequencies(hand);
        int pairs = 0;
        for (int count : freq.values()) if (count == 2) pairs++;
        return pairs;
    }

    private static Map<Integer, Integer> rankFrequencies(List<Card> hand) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (Card c : hand) {
            int v = c.rankValue();
            freq.put(v, freq.getOrDefault(v, 0) + 1);
        }
        return freq;
    }

    private static List<Integer> ranksSorted(List<Card> hand) {
        List<Integer> ranks = new ArrayList<>();
        for (Card c : hand) ranks.add(c.rankValue());
        Collections.sort(ranks);
        return ranks;
    }
}
