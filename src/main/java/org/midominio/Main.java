package org.midominio;


//import org.midominio.behavioral.command.CreditCard;
//import org.midominio.behavioral.command.CreditCardActivateCommand;
//import org.midominio.behavioral.command.CreditCardDesactivateCommand;
//import org.midominio.behavioral.command.CreditCardInvoker;
import org.midominio.behavioral.command2.commands.CommandHistory;
import org.midominio.behavioral.command2.commands.CreditCardActivateCommand;
import org.midominio.behavioral.command2.commands.CreditCardDesactivateCommand;
import org.midominio.behavioral.command2.creditcard.CreditCard;
import org.midominio.behavioral.command2.invoker.CreditCardInvoker;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }
    private static void testPattern(){
        //invoker 1
//        CreditCard creditCard = new CreditCard();
//        CreditCard creditCardDesactivate = new CreditCard();
//
//        CreditCardInvoker invoker = new CreditCardInvoker();
//
//        invoker.setCommand(new CreditCardActivateCommand(creditCard));
//        invoker.run();
//
//        System.out.println("------------------");
//
//        invoker.setCommand(new CreditCardDesactivateCommand(creditCardDesactivate));
//        invoker.run();

        //invoker 2
        CreditCard creditCard = new CreditCard();
        CreditCardActivateCommand activateCommand = new CreditCardActivateCommand(creditCard);
        CreditCardDesactivateCommand desactivateCommand = new CreditCardDesactivateCommand(creditCard);

        CreditCardInvoker invoker = new CreditCardInvoker();
        CommandHistory history = new CommandHistory();

        //activate
        invoker.setCommand(activateCommand);
        invoker.executeCommand();
        history.push(activateCommand);

        //desactivate
        invoker.setCommand(desactivateCommand);
        invoker.executeCommand();
        history.push(desactivateCommand);

        history.pop();

    }
}