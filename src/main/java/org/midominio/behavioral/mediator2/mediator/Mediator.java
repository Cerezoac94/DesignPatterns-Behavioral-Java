package org.midominio.behavioral.mediator2.mediator;

import org.midominio.behavioral.mediator2.colleagues.User;

public interface Mediator {
    void addNewNote(Note note);
    void deleteNote(Note note);

    void notifyNewNote(User user, Note note);
}
