package org.midominio.behavioral.chainofresponsibility;

public class Black implements ApproveLoanChain{
    private ApproveLoanChain next;
    @Override
    public void setNext(ApproveLoanChain loan) {
        this.next = loan;
    }

    @Override
    public ApproveLoanChain getNext() {
        return this.next;
    }

    @Override
    public void creditCardRequest(int totalLoan) {
        if(totalLoan > 100000){
            System.out.println("Esta solicitud de tarjeta de crédito es de tipo Black");
        }else{
            next.creditCardRequest(totalLoan);
        }
    }
}
