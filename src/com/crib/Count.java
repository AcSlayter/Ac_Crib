package com.crib;

import com.crib.deck.Card;

import java.util.List;

/**
 * Created by Aaron on 1/25/2017.
 */
public class Count {


    private List<Card> inplay = null;

    public Count(List<Card> inplay) {
        this.inplay = inplay;
    }

    public void setInplay(List<Card> inplay) {
        this.inplay = inplay;
    }

    public int getScore(){
        for(Card card : inplay){
            card.getCardValue().ordinal();
        }
        return 0;
    }


}
