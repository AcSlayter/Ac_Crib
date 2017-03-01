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
    public void testRunLeadingInvalid(){
        List<Card> cards = new ArrayList<Card>();

        cards.add(new Card(Suit.CLUB, CardValue.TEN));
        cards.add(new Card(Suit.CLUB, CardValue.EIGHT));
        cards.add(new Card(Suit.CLUB, CardValue.NINE));
        cards.add(new Card(Suit.CLUB, CardValue.FIVE));

        Count temp = new Count();
        int points = temp.getRun(cards);

        Assert.assertEquals(points,3);
    }

    @Test
    public void testRunTrailingInvalid(){
        List<Card> cards = new ArrayList<Card>();

        cards.add(new Card(Suit.CLUB, CardValue.TEN));
        cards.add(new Card(Suit.CLUB, CardValue.EIGHT));
        cards.add(new Card(Suit.CLUB, CardValue.NINE));
        cards.add(new Card(Suit.CLUB, CardValue.QUEEN));

        Count temp = new Count();
        int points = temp.getRun(cards);

        Assert.assertEquals(points,3);
    }

    @Test
    public void testRunWraping(){
        List<Card> cards = new ArrayList<Card>();

        cards.add(new Card(Suit.CLUB, CardValue.ACE));
        cards.add(new Card(Suit.CLUB, CardValue.TWO));
        cards.add(new Card(Suit.CLUB, CardValue.KING));
        cards.add(new Card(Suit.CLUB, CardValue.QUEEN));

        Count temp = new Count();
        int points = temp.getRun(cards);

        Assert.assertEquals(points,0);
    }

    @Test
    public void testRunAll(){
        List<Card> cards = new ArrayList<Card>();

        cards.add(new Card(Suit.CLUB, CardValue.ACE));
        cards.add(new Card(Suit.CLUB, CardValue.KING));
        cards.add(new Card(Suit.CLUB, CardValue.QUEEN));
        cards.add(new Card(Suit.CLUB, CardValue.TWO));

        Count temp = new Count();
        int points = temp.getRun(cards);

        Assert.assertEquals(points,3);
    }

    @Test
    public void testSort(){
        List<Card> cards = new ArrayList<Card>();

        cards.add(new Card(Suit.CLUB, CardValue.TEN));
        cards.add(new Card(Suit.CLUB, CardValue.SIX));
        cards.add(new Card(Suit.CLUB, CardValue.NINE));
        cards.add(new Card(Suit.CLUB, CardValue.FIVE));

        Card.CardNumberCompararor cardNumberCompar = new Card.CardNumberCompararor();
        cards.sort(cardNumberCompar);

        Assert.assertEquals(cards.get(0).getCardValue(), CardValue.FIVE);
        Assert.assertEquals(cards.get(1).getCardValue(), CardValue.SIX);
        Assert.assertEquals(cards.get(2).getCardValue(), CardValue.NINE);
        Assert.assertEquals(cards.get(3).getCardValue(), CardValue.TEN);
    }
}

