package org.midominio.behavioral.observer3;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
