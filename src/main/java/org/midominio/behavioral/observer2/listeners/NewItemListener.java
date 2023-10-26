package org.midominio.behavioral.observer2.listeners;

public class NewItemListener implements Listener{
   private String email;
    public NewItemListener(String email){
        //verificar email en bbdd
        this.email = email;
   }
    @Override
    public void update(String eventType, String item) {
        System.out.println("Enviando email a: " + this.email);
        System.out.println("Nuevo artículo: " + item + " en inventario");
    }
}
