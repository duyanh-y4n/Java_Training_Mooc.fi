
public class Main {

    public static void main(String[] args) {
        // write some test code here
        Hand hand = new Hand();
        hand.add(new Card(14,Card.DIAMONDS));
        hand.add(new Card(12,Card.HEARTS));
        hand.add(new Card(12,Card.SPADES));
        hand.add(new Card(12,Card.HEARTS));
        hand.add(new Card(12,Card.CLUBS));
        hand.add(new Card(11,Card.DIAMONDS));

        hand.sortAgainstSuit();
        hand.print();
    }
}
