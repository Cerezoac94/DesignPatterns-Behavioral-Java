package org.midominio.behavioral.observer;

import java.util.*;

//ConcreteSubject
public class MessagePublisher implements Subject{
    private List<Observer> observers = new ArrayList<>();
    @Override
    public void attach(Observer o) {
        observers.add(o);
    }

    @Override
    public void dettach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyUpdate(Semaforo semaforo) {
        for(Observer o: observers){
            o.update(semaforo);
        }
    }
}