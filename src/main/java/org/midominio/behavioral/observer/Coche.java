package org.midominio.behavioral.observer;

//ConcreteObserver
public class Coche implements Observer{
    @Override
    public void update(Semaforo semaforo) {
        if (semaforo.status.equals("ROJO")) {
            System.out.println("El semaforo para automoviles esta en ROJO: Coche NO puede pasar");
        }else {
            System.out.println("El semaforo para automoviles esta en VERDE: Coche SI puede pasar");
        }
    }
}
