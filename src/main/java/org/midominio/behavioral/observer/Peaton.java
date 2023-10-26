package org.midominio.behavioral.observer;

//ConcreteObserver
public class Peaton implements Observer{
    @Override
    public void update(Semaforo semaforo) {
        if (semaforo.status.equals("ROJO")) {
            System.out.println("El semaforo para peaton esta en VERDE: Peaton SI puede pasar");
        }else {
            System.out.println("El semaforo para peaton esta en ROJO: Peaton NO puede pasar");
        }
    }
}
