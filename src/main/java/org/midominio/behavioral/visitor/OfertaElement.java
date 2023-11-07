package org.midominio.behavioral.visitor;

//Element
public interface OfertaElement {
    void accept(CreditCardVisitor visitor);
}
