package org.midominio;


import org.midominio.behavioral.memento.Article;
import org.midominio.behavioral.memento.ArticleMemento;
import org.midominio.behavioral.memento.Caretaker;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }
    private static void testPattern(){
        //Memento 1
        Caretaker caretaker = new Caretaker();
        Article article = new Article("Christopher Nolan", "Memento es una película");
        article.setText(article.getText() + " de Nolan");
        //caretaker index 0
        caretaker.addMemento(article.createMemento());

        article.setText(article.getText() + ", protagonizada por Guy Pearce");
        System.out.println(article.getText());
        //caretaker index 1
        caretaker.addMemento(article.createMemento());

        article.setText(article.getText() + " y Leonardo DiCaprio");
        System.out.println(article.getText());

        ArticleMemento memento1 = caretaker.getMemento(0);
        ArticleMemento memento2 = caretaker.getMemento(1);

        article.restoreMemento(memento1); //pos 0
        System.out.println(article.getText()); //"Memento es una película de Nolan"

        article.restoreMemento(memento2); //pos 1
        System.out.println(article.getText()); // "Memento es una película de Nolan, protagonizada por Guy Pearce"

        article.setText(article.getText() + " del año 2000");
        System.out.println(article.getText());

        //Memento 2
    }
}