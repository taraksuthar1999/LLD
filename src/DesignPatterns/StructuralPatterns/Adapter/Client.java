package DesignPatterns.StructuralPatterns.Adapter;

public class Client {

    public static void main(String[] args) {
        CoinsBuyOut coinsBuyOut = new CoinsBuyOut(new ICICIPaymentGateway());
        coinsBuyOut.pull(1000);
    }
}
