package org.midominio.behavioral.chainofresponsibility2;

public class GoldCard extends ApproveLoanChain{
    @Override
    public boolean check(int totalLoan) {
        if(totalLoan <= 10000){
            System.out.println("Esta solicitud de tarjeta de crédito es de tipo Gold");
            return true;
        }else{
            return checkNext(totalLoan);
        }
    }
}
