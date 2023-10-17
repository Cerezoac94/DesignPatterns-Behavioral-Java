package org.midominio.behavioral.chainofresponsibility;

public class Card implements ApproveLoanChain{
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
        Gold gold = new Gold();
        this.setNext(gold);

        Platinum platinum = new Platinum();
        gold.setNext(platinum);

        Black black = new Black();
        platinum.setNext(black);

        next.creditCardRequest(totalLoan);
    }
}
