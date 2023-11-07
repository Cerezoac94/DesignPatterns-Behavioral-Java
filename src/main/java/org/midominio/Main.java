package org.midominio;


//import org.midominio.behavioral.visitor.*;

import org.midominio.behavioral.visitor2.computer.Computer;
import org.midominio.behavioral.visitor2.computer.ComputerPart;
import org.midominio.behavioral.visitor2.visitor.ComputerPartDisplayVisitor;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }
    private static void testPattern(){
        //Visitor 1
//        OfertaElement ofertaElement = new OfertaGasolina();
//        ofertaElement.accept(new BlackCreditCardVisitor());
//
//        ofertaElement = new OfertaVuelos();
//        ofertaElement.accept(new ClassicCreditCardVisitor());

        //Visitor 2
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}