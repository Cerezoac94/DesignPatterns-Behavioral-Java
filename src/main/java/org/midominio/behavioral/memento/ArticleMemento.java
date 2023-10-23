package org.midominio.behavioral.memento;

//Memento
public class ArticleMemento {
    private String author;
    private String text;

    public ArticleMemento(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getText() {
        return this.text;
    }
}