package org.midominio.behavioral.visitor;

//Visitor
public interface CreditCardVisitor {
    void ofertaGasolina(OfertaGasolina ofertaGasolina);
    void ofertaVuelos(OfertaVuelos ofertaVuelos);
}
