package org.midominio.behavioral.visitor2.computer;

import org.midominio.behavioral.visitor2.visitor.ComputerPartVisitor;

//ConcreteElement
public class Monitor implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
