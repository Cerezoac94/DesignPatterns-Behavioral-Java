package org.midominio.behavioral.state2;

public class StopState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("Estado cambiado a 'Detenido'");
        context.setState(this);
    }

    public String toString(){
        return "Detenido";
    }
}
