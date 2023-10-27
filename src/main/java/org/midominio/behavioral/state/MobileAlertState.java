package org.midominio.behavioral.state;

//State
public interface MobileAlertState {
    //Recibe el contexto para para permitir que los estados accedan
    // a información en el contexto o cambien el estado del contexto.
    void alert(MobileAlertStateContext context);
}
