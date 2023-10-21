package org.midominio.behavioral.mediator2.colleagues;

import org.midominio.behavioral.mediator2.mediator.Mediator;
import org.midominio.behavioral.mediator2.mediator.Note;

//Colleague
public abstract class User {
    protected Mediator mediator;
    private String name;
    private String typeUser;

    protected User(Mediator mediator, String name, String typeUser){
        this.mediator = mediator;
        this.name = name;
        this.typeUser = typeUser;
    }

    public abstract void createNote(Note note);

    public String getName(){
        return this.name;
    }

    public String getTypeUser(){
        return this.typeUser;
    }

    @Override
    public String toString() {
        return typeUser + ": " + name;
    }
}
