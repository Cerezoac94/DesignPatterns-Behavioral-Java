package org.midominio.behavioral.visitor;

//Concrete element
public class OfertaVuelos implements OfertaElement{
    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.ofertaVuelos(this);
    }
}
