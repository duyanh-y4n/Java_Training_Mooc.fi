import java.util.Comparator;

public class SortAgainstSuit implements Comparator<Card> {

    @Override
    public int compare(Card card, Card card1) {
        return card.getSuit()-card1.getSuit();
    }
}
