package org.midominio.behavioral.command;

public class CreditCard {
    public void sendPinNumberToCustomer(){
        System.out.println("El pin ha sido enviado al cliente.");
    }
    public void sendSMSToCustomerActivate(){
        System.out.println("El SMS de aviso de tarjeta activada, ya ha sido enviado al cliente.");
        System.out.println("Ponerse en contacto si el SMS no ha sido recibido");
    }
    public void activate(){
        System.out.println("La tarjeta ha sido activada.");
    }
    public void desactivate(){
        System.out.println("La tarjeta ha sido desactivada.");
    }
    public void sendSMSToCustomerDesactivate(){
        System.out.println("El SMS de aviso de tarjeta desactivada, ya ha sido enviado al cliente.");
    }
}
