package org.midominio.behavioral.observer2.store;

import org.midominio.behavioral.observer2.publisher.MessagePublisher;

//subject
public class Store {
    public MessagePublisher events;

    public Store(){
        this.events = new MessagePublisher("Nuevo_Articulo","Descuento_Articulo");
    }

    public void newItem(String item){
        events.notify("Nuevo_Articulo", item);
    }

    public void discountItem(String item){
        events.notify("Descuento_Articulo", item);
    }
}
