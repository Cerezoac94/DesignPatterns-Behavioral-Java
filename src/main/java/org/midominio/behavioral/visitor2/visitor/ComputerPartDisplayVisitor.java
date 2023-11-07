package org.midominio.behavioral.visitor2.visitor;

import org.midominio.behavioral.visitor2.computer.Computer;
import org.midominio.behavioral.visitor2.computer.Keyboard;
import org.midominio.behavioral.visitor2.computer.Monitor;
import org.midominio.behavioral.visitor2.computer.Mouse;

//ConcreteVisitor
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse");
    }
}
