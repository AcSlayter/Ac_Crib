package com.crib;

import com.crib.deck.Card;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Aaron on 1/25/2017.
 */
public class Count {


    public Count() {

    }

    public int getScore(){

//        return getRunScore() + getPairScore() + getFifteenScore() + getFlushScore() + getNibsScore();
        return 0;
    }


    public int getPair(Card a, Card b){
        if(a == b){
            return 2;
        }
        return 0;
    }

    public int getRun(List<Card> inPlay){
        int count = 0;

        inPlay.sort( new Card.CardNumberCompararor() );

        for( int i = 1 ; i < inPlay.size() ; i++ ) {
            if(inPlay.get(i-1).getCardValue().ordinal() + 1 != inPlay.get(i).getCardValue().ordinal()) {
                count = 0;
            }else{
                count++;
            }
        }
        if(count >= 2){
            return count+1;
        }

        return 0;
    }

}
