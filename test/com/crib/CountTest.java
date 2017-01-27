package com.crib;

import com.crib.deck.Card;
import com.crib.deck.CardValue;
import com.crib.deck.Suit;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aaron on 1/25/2017.
 */
public class CountTest {
    @Test
    public void testFifteenTwo() throws Exception {
        List<Card> cards = new ArrayList<Card>();

        cards.add(new Card(Suit.CLUB, CardValue.FIVE));
        cards.add(new Card(Suit.CLUB, CardValue.SIX));
        cards.add(new Card(Suit.CLUB, CardValue.NINE));
        cards.add(new Card(Suit.CLUB, CardValue.TEN));

        List<Card> hand = cards;

        Count count = new Count(hand);
        Assert.assertEquals(2, count.getScore());
    }
}

