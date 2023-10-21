package org.midominio.behavioral.mediator2.colleagues;

import org.midominio.behavioral.mediator2.mediator.Mediator;
import org.midominio.behavioral.mediator2.mediator.Note;

//Concrete colleague
public class Student extends User{
    public Student(Mediator mediator, String name) {
        super(mediator, name, "Student");
    }

    @Override
    public void createNote(Note note) {
        mediator.addNewNote(note);
        mediator.notifyNewNote(this, note);
    }
}
