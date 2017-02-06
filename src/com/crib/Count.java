package com.crib;

import com.crib.deck.Card;

import java.util.ArrayList;
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

        return getRunScore() + getPairScore() + getFifteenScore() + getFlushScore() + getNibsScore();
    }

    public int getRunScore(){
        return 0;
    }

    public int getPairScore(){
        return 0;
    }

    public int getFifteenScore() {
        return 0;
    }
    public int getFlushScore(){
        return 0;
    }

    public int getNibsScore(){
        return 0;
    }
}
