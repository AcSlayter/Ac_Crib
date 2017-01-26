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
    public void testFifteenTwo_2Cards() throws Exception {
        List<Card> cards = new ArrayList<Card>();

        cards.add(new Card(Suit.CLUB, CardValue.JACK));
        cards.add(new Card(Suit.CLUB, CardValue.FIVE));

        List<Card> hand = cards;

        Count count = new Count(hand);
        Assert.assertEquals(2, count.getScore() );
    }

    @Test
    public void testFifteenTwo_3Cards() throws Exception {
        List<Card> cards = new ArrayList<Card>();

        cards.add(new Card(Suit.CLUB, CardValue.EIGHT));
        cards.add(new Card(Suit.CLUB, CardValue.SIX));
        cards.add(new Card(Suit.CLUB, CardValue.ACE));

        List<Card> hand = cards;

        Count count = new Count(hand);
        Assert.assertEquals(2, count.getScore() );
    }

    @Test
    public void testFifteenTwo_4Cards() throws Exception {
        List<Card> cards = new ArrayList<Card>();

        cards.add(new Card(Suit.CLUB, CardValue.SEVEN));
        cards.add(new Card(Suit.CLUB, CardValue.ACE));
        cards.add(new Card(Suit.CLUB, CardValue.THREE));
        cards.add(new Card(Suit.CLUB, CardValue.FOUR));

        List<Card> hand = cards;

        Count count = new Count(hand);
        Assert.assertEquals(2, count.getScore() );
    }

    @Test
    public void testFifteenTwo_4Cards_Extra() throws Exception {
        List<Card> cards = new ArrayList<Card>();

        cards.add(new Card(Suit.CLUB, CardValue.SEVEN));
        cards.add(new Card(Suit.CLUB, CardValue.ACE));
        cards.add(new Card(Suit.CLUB, CardValue.THREE));
        cards.add(new Card(Suit.CLUB, CardValue.FOUR));
        cards.add(new Card(Suit.CLUB, CardValue.SIX));

        List<Card> hand = cards;

        Count count = new Count(hand);
        Assert.assertEquals(2, count.getScore() );
    }
}