package org.midominio.behavioral.templatemethod;

//Abstract class
public abstract class Payment {
    abstract void initalize();
    abstract void startPayment();
    abstract void endPayment();

    //Template method
    public final void makePayment(){
        initalize();
        startPayment();
        endPayment();
    }
}
