package org.midominio.behavioral.mediator2.mediator;

public class Note {
    private String name;
    private String text;

    public Note(){
        this.name = "New note";
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
