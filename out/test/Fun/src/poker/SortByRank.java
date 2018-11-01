package poker;

import java.util.Comparator;

public class SortByRank implements Comparator<Card> {
    @Override
    public int compare(Card o1, Card o2) {
        return Integer.compare(o1.getRank().ordinal(), o2.getRank().ordinal());
    }
}
