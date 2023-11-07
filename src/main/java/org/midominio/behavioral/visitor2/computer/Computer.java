package org.midominio.behavioral.visitor2.computer;

import org.midominio.behavioral.visitor2.visitor.ComputerPartVisitor;

//ConcreteElement
public class Computer implements ComputerPart{
    ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[] {new Monitor(), new Keyboard(), new Mouse()};
    }
    @Override
    public void accept(ComputerPartVisitor visitor) {
        for(int i = 0; i < parts.length; i++){
            parts[i].accept(visitor);
        }
        visitor.visit(this);
    }
}
