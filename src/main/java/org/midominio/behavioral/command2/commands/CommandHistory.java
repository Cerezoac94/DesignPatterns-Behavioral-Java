package org.midominio.behavioral.command2.commands;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command cmd){
        history.push(cmd);
    }

    public void pop(){
        if(!isEmpty()){
            System.out.println("Deshaciendo ultimo comando.");
            Command command = history.pop();
            if(command != null){
                System.out.println("Commando anterior eliminado.");
            }else{
                System.out.println("No se pudo deshacer el comando anterior.");
            }
            return;
        }
        System.out.println("No hay nada por deshacer.");
    }

    public boolean isEmpty(){
        return history.isEmpty();
    }
}
