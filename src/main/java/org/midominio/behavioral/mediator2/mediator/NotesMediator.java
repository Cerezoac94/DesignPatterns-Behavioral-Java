package org.midominio.behavioral.mediator2.mediator;

import org.midominio.behavioral.mediator2.colleagues.User;

import java.util.ArrayList;
import java.util.List;

public class NotesMediator implements Mediator{
    private List<Note> listNotes = new ArrayList<>();
    @Override
    public void addNewNote(Note note) {
        listNotes.add(note);
    }

    @Override
    public void deleteNote(Note note) {
        if(listNotes.contains(note)){
            listNotes.remove(note);
            System.out.println(note.getName() +" eliminada correctamente.");
        }
    }

    @Override
    public void notifyNewNote(User user, Note note) {
        System.out.println(user + " ha creado la nota: " + note.getName());
    }
}
