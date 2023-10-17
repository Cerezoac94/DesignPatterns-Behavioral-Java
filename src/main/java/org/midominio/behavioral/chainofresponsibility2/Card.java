package org.midominio.behavioral.chainofresponsibility2;


public class Card extends ApproveLoanChain {
    public void creditCardRequest(int totalLoan) {
       ApproveLoanChain chain = ApproveLoanChain.link(
                //simulado param de tipo usuario
                new CreditCardValidator(true),
                new GoldCard(),
                new PlatinumCard(),
                new BlackCard()
        );
        chain.check(totalLoan);
    }

    @Override
    public boolean check(int totalLoan) {
        return checkNext(totalLoan);
    }
}
