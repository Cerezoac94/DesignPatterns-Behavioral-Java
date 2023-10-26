package org.midominio.behavioral.observer2.publisher;

import org.midominio.behavioral.observer2.listeners.Listener;
import java.util.*;

//subject
public class MessagePublisher {
    Map<String, List<Listener>> listeners = new HashMap<>();

    //Eventos como nuevoArticulo, descuentoArticulo, etc.
    public MessagePublisher(String... events) {
        for(String event : events){
            this.listeners.put(event, new ArrayList<>());
        }
    }

    public void suscribe(String eventType, Listener listener){
        List<Listener> eventsList = listeners.get(eventType);
        eventsList.add(listener);
    }

    public void unsuscribe(String eventType, Listener listener){
        List<Listener> eventList = listeners.get(eventType);
        eventList.remove(listener);
    }

    public void notify(String eventType, String item){
        List<Listener> eventsList = listeners.get(eventType);
        for(Listener listener : eventsList){
            listener.update(eventType, item);
        }
    }
}
