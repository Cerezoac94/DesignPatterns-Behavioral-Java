package org.midominio.behavioral.state;

//ConcreteState
public class Vibration implements MobileAlertState{
    @Override
    public void alert(MobileAlertStateContext context) {
        System.out.println("Vibrando...Vibrando...");
    }
}
