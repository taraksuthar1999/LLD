package DesignPatterns.StructuralPatterns.Adapter;

public class ICICIPaymentGateway implements PaymentGateway{
    @Override
    public void withdrawMoney() {

    }

    @Override
    public int checkBalance() {
        return 0;
    }

    @Override
    public void depositMoney() {

    }
}
