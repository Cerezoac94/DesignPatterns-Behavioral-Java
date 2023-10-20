package org.midominio.behavioral.command2.commands;

import org.midominio.behavioral.command2.creditcard.CreditCard;

//concrete command
public class CreditCardActivateCommand extends Command{
    public CreditCardActivateCommand(CreditCard creditCard){
        super(creditCard);
    }
    @Override
    public void execute() {
        creditCard.sendPinNumberToCustomer();
        creditCard.activate();
        creditCard.sendSMSToCustomerActivate();
    }
}
