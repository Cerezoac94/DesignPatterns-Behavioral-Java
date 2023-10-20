package org.midominio;

import org.midominio.behavioral.iterator.Card;
import org.midominio.behavioral.iterator.CardList;
import org.midominio.behavioral.iterator.Iterator;
import org.midominio.behavioral.iterator.List;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }
    private static void testPattern(){
        //Iterator 1
        Card[] cards = new Card[5];
        cards[0] = new Card("VISA");
        cards[1] = new Card("AMEX");
        cards[2] = new Card("MASTER CARD");
        cards[3] = new Card("GOOGLE CARD");
        cards[4] = new Card("APPLE CARD");

        List lista = new CardList(cards);
        Iterator iterator = lista.iterator();

        while(iterator.hasNext()){
            Card tarjeta = (Card) iterator.next();
            System.out.println(tarjeta.getType());
        }
    }
}