package org.midominio;


//import org.midominio.behavioral.observer.Coche;
//import org.midominio.behavioral.observer.MessagePublisher;
//import org.midominio.behavioral.observer.Peaton;
//import org.midominio.behavioral.observer.Semaforo;


//import org.midominio.behavioral.observer2.listeners.DiscountItemListener;
//import org.midominio.behavioral.observer2.listeners.NewItemListener;
//import org.midominio.behavioral.observer2.store.Store;

import org.midominio.behavioral.observer3.BinaryObserver;
import org.midominio.behavioral.observer3.HexaObserver;
import org.midominio.behavioral.observer3.OctalObserver;
import org.midominio.behavioral.observer3.Subject;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }
    private static void testPattern(){
        //Observer 1
//        Coche coche = new Coche();
//        Peaton peaton = new Peaton();
//        MessagePublisher messagePublisher = new MessagePublisher();
//
//        messagePublisher.attach(coche);
//        messagePublisher.attach(peaton);
//        messagePublisher.notifyUpdate(new Semaforo("ROJO"));
//        try {
//            Thread.sleep(5000);
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//        messagePublisher.notifyUpdate(new Semaforo("VERDE"));

        //Observer 2
//        Store store = new Store();
//        store.events.suscribe("Nuevo_Articulo", new NewItemListener("email@gmail.com"));
//        store.events.suscribe("Descuento_Articulo", new DiscountItemListener("correo@gmail.com"));
//
//        store.newItem("Computadora");
//        store.discountItem("Computadora");

        //Observer 3
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}