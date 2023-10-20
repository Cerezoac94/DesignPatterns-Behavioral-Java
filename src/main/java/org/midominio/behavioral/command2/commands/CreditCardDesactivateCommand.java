package org.midominio.behavioral.command2.commands;

import org.midominio.behavioral.command2.creditcard.CreditCard;

//concrete command
public class CreditCardDesactivateCommand extends Command{
    public CreditCardDesactivateCommand(CreditCard creditCard){
        super(creditCard);
    }
    @Override
    public void execute() {
        creditCard.desactivate();
        creditCard.sendSMSToCustomerDesactivate();
    }
}
