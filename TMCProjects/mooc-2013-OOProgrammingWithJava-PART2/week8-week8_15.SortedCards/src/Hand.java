import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;

    public Hand(){
        this.cards = new ArrayList<Card>();
    }

    public void add(Card card){
        this.cards.add(card);
    }

    public void print(){
        for (Card card :
                this.cards) {
            System.out.println(card);
        }
    }

    public void sort(){
        Collections.sort(this.cards);
    }

    @Override
    public int compareTo(Hand hand) {
        return this.sumOfHand()-hand.sumOfHand();
    }

    public int sumOfHand() {
        int sum=0;
        for (Card card :
                this.cards) {
            sum+=card.getValue();
        }
        return sum;
    }

    public void sortAgainstSuit(){
        Collections.sort(this.cards, new SortAgainstSuitAndValue());
    }

    public void sortAgainstSuitAndValue(){
        Collections.sort(this.cards, new SortAgainstSuitAndValue());
    }
}
