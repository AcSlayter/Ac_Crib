package com.crib.deck;

import com.crib.deck.Card;
import com.crib.deck.Deck;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Aaron on 1/25/2017.
 */
public class DeckTest {

    @Test
    public void testDefaultConstructor() throws Exception {
        Deck deck = new Deck();

        Assert.assertEquals(deck.getDeckCardCount() , 52 );
    }

    @Test
    public void testMultipleConstructor() throws Exception {
        Deck deck = new Deck(3);

        Assert.assertEquals(deck.getDeckCardCount() , 52*3 );
    }

    @Test
    public void testGetCard() {
        Deck deck = new Deck();

        Card card = null;
        int count = 0;

        do {
            card = deck.getCard();
            count++;
        }while (deck.getDeckCardCount() != 0);

        Assert.assertEquals(count , 52);
        Assert.assertNull(deck.getCard());

    }

}