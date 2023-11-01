package org.midominio.behavioral.templatemethod;

//Concrete class
public class Paypal extends Payment{
    @Override
    void initalize() {
        System.out.println("Inicializando el pago con Paypal...");
    }

    @Override
    void startPayment() {
        System.out.println("Realizando el pago con Paypal...");
    }

    @Override
    void endPayment() {
        System.out.println("Pago realizado con Paypal");
    }
}
