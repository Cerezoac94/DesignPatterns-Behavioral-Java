package org.midominio.behavioral.mediator;

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }
    public abstract void send(String message);
    public abstract void messageReceived(String message);
}
