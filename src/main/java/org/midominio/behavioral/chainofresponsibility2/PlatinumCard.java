package org.midominio.behavioral.chainofresponsibility2;

public class PlatinumCard extends ApproveLoanChain{
    @Override
    public boolean check(int totalLoan) {
        if(totalLoan > 10000 && totalLoan <=100000){
            System.out.println("Esta solicitud de tarjeta de crédito es de tipo Platinum");
            return true;
        }else{
            return checkNext(totalLoan);
        }
    }
}
