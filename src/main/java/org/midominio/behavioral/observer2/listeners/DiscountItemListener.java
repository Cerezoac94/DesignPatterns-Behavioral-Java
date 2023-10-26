package org.midominio.behavioral.observer2.listeners;

public class DiscountItemListener implements Listener{
    private String email;

    public DiscountItemListener(String email){
        //verificar email en bbdd
        this.email = email;
    }
    @Override
    public void update(String eventType, String item) {
        System.out.println("Enviando email a: " + this.email);
        System.out.println("Descuento en el producto: " + item);
    }
}
