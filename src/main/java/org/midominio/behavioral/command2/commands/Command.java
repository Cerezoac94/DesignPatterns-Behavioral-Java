package org.midominio.behavioral.command2.commands;


import org.midominio.behavioral.command2.creditcard.CreditCard;

public abstract class Command {
    public CreditCard creditCard;

    Command(CreditCard creditCard){
        this.creditCard = creditCard;
    }

    public abstract void execute();
}
