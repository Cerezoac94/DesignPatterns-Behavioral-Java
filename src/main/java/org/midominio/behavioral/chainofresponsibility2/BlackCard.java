package org.midominio.behavioral.chainofresponsibility2;

public class BlackCard extends ApproveLoanChain{
    @Override
    public boolean check(int totalLoan) {
        if(totalLoan > 100000){
            System.out.println("Esta solicitud de tarjeta de crédito es de tipo Black");
            return true;
        }else{
            return checkNext(totalLoan);
        }
    }
}
