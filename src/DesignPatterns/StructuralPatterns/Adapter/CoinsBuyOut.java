package DesignPatterns.StructuralPatterns.Adapter;

public class CoinsBuyOut {
    PaymentGateway paymentGateway;

    CoinsBuyOut(PaymentGateway p){
        paymentGateway = p;
    }

    void pull(int amount){
       int previousAmount = paymentGateway.checkBalance();
       if(previousAmount>=amount){
           paymentGateway.withdrawMoney();
       }
    }

}
