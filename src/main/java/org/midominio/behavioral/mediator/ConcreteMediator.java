package org.midominio.behavioral.mediator;

public class ConcreteMediator implements Mediator{
    private ConcreteColleague1 user1;
    private ConcreteColleague2 user2;

    public void setUser1(ConcreteColleague1 colleage1){
        this.user1 = colleage1;
    }
    public void setUser2(ConcreteColleague2 colleage2){
        this.user2 = colleage2;
    }
    @Override
    public void send(String message, Colleague colleague) {
        if(colleague == user1){
            user2.messageReceived(message);
        } else if(colleague == user2) {
            user1.messageReceived(message);
        }
    }
}
