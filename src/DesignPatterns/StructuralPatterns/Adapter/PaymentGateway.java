package DesignPatterns.StructuralPatterns.Adapter;

public interface PaymentGateway {
    void withdrawMoney();

    int checkBalance();

    void depositMoney();

}
