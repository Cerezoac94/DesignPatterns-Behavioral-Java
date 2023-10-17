package org.midominio.behavioral.chainofresponsibility2;

public abstract class ApproveLoanChain {
    private ApproveLoanChain next;

    public static ApproveLoanChain link(ApproveLoanChain first, ApproveLoanChain...chain){
        //enlaza secuencialmente la cadena de responsabilidad, se inicia con first,
        // posterior a esto es con el atributo next de cada objeto del eslabon
        // con el que se avanza en la cadena
        ApproveLoanChain head = first;
        for (ApproveLoanChain nextInChain : chain){
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract boolean check(int totalLoan);

    protected boolean checkNext(int totalLoan){
        if(next == null){
            return true;
        }
        return next.check(totalLoan);
    }
}
