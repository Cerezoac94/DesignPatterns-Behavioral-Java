package org.midominio.behavioral.state;

//ConcreteState
public class Silent implements MobileAlertState{
    @Override
    public void alert(MobileAlertStateContext context) {
        System.out.println("Silencio...Pantalla iluminada...");
    }
}
