package org.midominio.behavioral.chainofresponsibility2;

public class CreditCardValidator extends ApproveLoanChain{
    //simula tipo User
    private boolean user;

    public CreditCardValidator(boolean user){
        this.user = user;
    }
    @Override
    public boolean check(int totalLoan) {
        //comprobar si User.history es suficiente
        if(!user){
            System.out.println("Usuario no apto");
            return false;
        }
        System.out.println("Usuario apto, veficiando tipo de tarjeta...");
        return checkNext(totalLoan);
    }
}
