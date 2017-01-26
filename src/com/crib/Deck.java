package com.crib;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aaron on 1/25/2017.
 */
public class Deck {
    List<Card> deck = null;

    public Deck() {
        this.deck = new ArrayList<Card>();
    }


    public void reset() {
        if (this.deck == null){
            this.deck = new ArrayList<Card>();
        } else {
            this.deck.clear();
        }
        for (Suit suit : Suit.values()){
            System.out.println(suit.toString());
        }
    }

}
