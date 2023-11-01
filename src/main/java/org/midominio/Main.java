package org.midominio;


//import org.midominio.behavioral.templatemethod.Payment;
//import org.midominio.behavioral.templatemethod.Paypal;
//import org.midominio.behavioral.templatemethod.Visa;

import org.midominio.behavioral.templatemethod2.DataMiner;
import org.midominio.behavioral.templatemethod2.PDFDataMiner;

public class Main {
    public static void main(String[] args) {
        testPattern();
    }
    private static void testPattern(){
        //Template method 1
//        Payment payment = new Visa();
//        payment.makePayment();
//
//        payment = new Paypal();
//        payment.makePayment();

        //Template method 2
        DataMiner dataMiner = new PDFDataMiner();
        dataMiner.mine("C:\\Antonio\\prueba.txt");
    }
}