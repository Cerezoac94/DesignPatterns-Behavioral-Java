package org.midominio.behavioral.visitor2.computer;

import org.midominio.behavioral.visitor2.visitor.ComputerPartVisitor;

//Element
public interface ComputerPart {
    public void accept(ComputerPartVisitor visitor);
}
