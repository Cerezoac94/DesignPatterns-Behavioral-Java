package org.midominio.behavioral.state2;

public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Estado cambiado a 'Iniciado'");
        context.setState(this);
    }

    public String toString(){
        return "Iniciado";
    }
}
