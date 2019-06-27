package pokerJava;

import java.util.ArrayList;

public class Player {
    String name;
    ArrayList<Card> hand = new ArrayList<>();

    public ArrayList<Card> getHand() {
        ArrayList<Card> dealtHand = new ArrayList<>();
        return dealtHand;
    }

    public int evaluateHand() {
        return 42;
    }


}
