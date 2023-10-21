package org.midominio.behavioral.mediator2.colleagues;

import org.midominio.behavioral.mediator2.mediator.Mediator;
import org.midominio.behavioral.mediator2.mediator.Note;

//Concrete colleague
public class Teacher extends User{

    public Teacher(Mediator mediator, String name) {
        super(mediator, name, "Teacher");
    }

    @Override
    public void createNote(Note note){
        mediator.addNewNote(note);
        mediator.notifyNewNote(this, note);
    }
    public void deleteNote(Note note){
        mediator.deleteNote(note);
    }
}
