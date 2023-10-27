package org.midominio;


//import org.midominio.behavioral.state.MobileAlertStateContext;
//import org.midominio.behavioral.state.Vibration;
//import org.midominio.behavioral.state2.Context;

import org.midominio.behavioral.state2.Context;
import org.midominio.behavioral.state2.StartState;
import org.midominio.behavioral.state2.StopState;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }
    private static void testPattern(){
        //State 1
//        MobileAlertStateContext context = new MobileAlertStateContext();
//        context.alert();
//        context.setState(new Vibration());
//        context.alert();

        //State 2
        Context context = new Context();

        StartState iniciado = new StartState();
        iniciado.doAction(context);
        System.out.println(context.getState());

        StopState detenido = new StopState();
        detenido.doAction(context);
        System.out.println(context.getState());
    }
}