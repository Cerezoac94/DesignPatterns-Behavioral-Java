package org.midominio.behavioral.observer;

//ConcreteSubject
public class Semaforo {
    public String status;

    public Semaforo(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
}
