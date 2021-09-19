class Card {
    String kind;
    int number;
    static int height;
}
public class Ex6_3 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();
        c1.kind = "heart";
        Card.height = 7;

        System.out.println(c1.kind);
        System.out.println(Card.height);

    }
}

