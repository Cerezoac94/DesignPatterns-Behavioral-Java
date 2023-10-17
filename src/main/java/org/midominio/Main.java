package org.midominio;

//import org.midominio.behavioral.chainofresponsibility.Card;

import org.midominio.behavioral.chainofresponsibility2.*;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }
    private static void testPattern(){
        //Chain of Responsibility 1
//        Card card = new Card();
//        card.creditCardRequest(104000);

        //Chain of Responsibility 2
       Card card = new Card();
       card.creditCardRequest(1000000);
    }
}