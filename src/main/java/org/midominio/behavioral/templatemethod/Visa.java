package org.midominio.behavioral.templatemethod;

//Concrete class
public class Visa extends Payment{
    @Override
    void initalize() {
        System.out.println("Inicializando el pago con Visa...");
    }

    @Override
    void startPayment() {
        System.out.println("Realizando el pago con Visa...");
    }

    @Override
    void endPayment() {
        System.out.println("Pago realizado con Visa");
    }
}
