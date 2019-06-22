package pokerJava;

public class Card {

    public enum Face { ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}
    public enum Suit { HEARTS, CLUBS, DIAMONDS, SPADES }

    private final Face face;
    private final Suit suit;

    //constructor
    public Card (Face cardFace, Suit cardSuit)  {
        face = cardFace;
        suit = cardSuit;
    }

    public Face getFace()   {
        return face;
    }

    public Suit getSuit()  {
        return suit;
    }

    public String toString()    {
        return String.format("%s of %s", face, suit);
    }
}
