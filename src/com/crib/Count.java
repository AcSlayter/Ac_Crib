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
        List<Card> tmp = new ArrayList<Card>(inplay);

        if(tmp.size() > 0){
            return getScoreHelper(tmp.remove(0),tmp, 0);
        }
        return 0;
    }

    private int getScoreHelper(Card main, List<Card> card, int points){
        if (card.size() == 0){
            return points;
        }
        int total = main.getCardValue().ordinal();

        for(int i = 0; i < card.size() && total <= 15; i++){
            total = card.get(i).getCardValue().ordinal() + total ;
            if(total == 15){
                points = points + 2;
            }
        }

        card.remove(0);
        points =  getScoreHelper(main, card, points);

        return points;
    }


}
