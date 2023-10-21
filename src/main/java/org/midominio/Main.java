package org.midominio;


import org.midominio.behavioral.mediator.ConcreteColleague1;
import org.midominio.behavioral.mediator.ConcreteColleague2;
import org.midominio.behavioral.mediator.ConcreteMediator;
import org.midominio.behavioral.mediator2.colleagues.Student;
import org.midominio.behavioral.mediator2.colleagues.Teacher;
import org.midominio.behavioral.mediator2.mediator.Note;
import org.midominio.behavioral.mediator2.mediator.NotesMediator;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }
    private static void testPattern(){
        //Mediator 1
//        ConcreteMediator mediator = new ConcreteMediator();
//        ConcreteColleague1 user1 = new ConcreteColleague1(mediator);
//        ConcreteColleague2 user2 = new ConcreteColleague2(mediator);
//
//        mediator.setUser1(user1);
//        mediator.setUser2(user2);
//
//        user1.send("Hola soy user 1");
//        user2.send("Hola user1, soy user2");

        //Mediator 2
        NotesMediator notes = new NotesMediator();
        Teacher teacher = new Teacher(notes, "Jorge");
        Student student = new Student(notes, "José");

        Note note1 = new Note();
        note1.setName("Nota de pogra");
        note1.setText("Este es un ejemplo de nota de programación");

        teacher.createNote(note1);

        Note note2 = new Note();
        note2.setName("Nota de patrones de diseño");
        note2.setText("Este es un ejemplo de nota de patrones de diseño");

        student.createNote(note2);
        teacher.deleteNote(note2);
    }
}