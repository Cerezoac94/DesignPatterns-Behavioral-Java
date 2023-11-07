package org.midominio.behavioral.visitor;

//Concrete element
public class OfertaGasolina implements OfertaElement{
    @Override
    public void accept(CreditCardVisitor visitor) {
        visitor.ofertaGasolina(this);
    }
}
