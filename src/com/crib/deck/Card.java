package com.crib.deck;

import java.util.Comparator;

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

    public static class CardNumberCompararor implements Comparator<Card> {
        @Override
        public int compare(Card a, Card b){
            int a_index = a.getCardValue().ordinal();
            int b_index = b.getCardValue().ordinal();
            if (a_index < b_index ) {
                return -1;
            } else if (a_index == b_index) {
                return 0;
            } else {
                return 1;
            }
        }
    }

}
