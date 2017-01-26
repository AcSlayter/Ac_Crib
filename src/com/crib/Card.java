package com.crib;

/**
 * Created by Aaron on 1/25/2017.
 */
public class Card {
    public Suit suit = null;
    public CardValue cardValue = null;

    public Card(Suit suit, CardValue cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public Suit getSuit() {
        return suit;
    }


    public CardValue getCardValue() {
        return cardValue;
    }



}
