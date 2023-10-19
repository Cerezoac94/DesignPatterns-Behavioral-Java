package org.midominio.behavioral.command2.invoker;

import org.midominio.behavioral.command2.commands.Command;

public class CreditCardInvoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        if (command != null) {
            command.execute();
        }
    }
}
