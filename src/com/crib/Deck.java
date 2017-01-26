package com.crib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Aaron on 1/25/2017.
 */
public class Deck {
    private List<Card> available = null;
    private List<Card> used = null;

    public Deck() {
        this(1);
    }

    public Deck (int numberOFDecks) {
        this.used = new ArrayList<Card>();
        this.available = new ArrayList<Card>();
        this.init(numberOFDecks);
    }

    public int getDeckCardCount(){
        return this.available.size();
    }

    private void init(int numberOfDecks) {
        this.available.clear();
        this.used.clear();

        for(int i = 0 ; i < numberOfDecks ; i++ )
            addDeck();
    }

    private void addDeck() {
        for (Suit suit : Suit.values()){
            for (CardValue cardValue : CardValue.values()){
                this.available.add(new Card(suit,cardValue));
            }
        }
    }

    public Card getCard(){
        int deckCardCount = getDeckCardCount();

        if (deckCardCount == 0){
            return null;
        }
        Random n = new Random();
        int cardIndex = n.nextInt(deckCardCount);

        Card card = this.available.remove(cardIndex);
        this.used.add(card);

        return card;
    }
}
