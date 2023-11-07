package org.midominio.behavioral.visitor;

//Concrete visitor
public class BlackCreditCardVisitor implements CreditCardVisitor{
    @Override
    public void ofertaGasolina(OfertaGasolina ofertaGasolina) {
        System.out.println("Descuento del 10% en Gasolina con tu tarjeta Black");
    }

    @Override
    public void ofertaVuelos(OfertaVuelos ofertaVuelos) {
        System.out.println("Descuento del 20% en Vuelos con tu tarjeta Black");
    }
}
