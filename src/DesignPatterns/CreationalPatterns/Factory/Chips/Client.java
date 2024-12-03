package DesignPatterns.CreationalPatterns.Factory.Chips;

public class Client {
    public static void main(String[] args) {
        ChipsFactory chipsFactory1 = new BalajiChipsFactory();
        ChipsFactory chipsFactory2 = new LaysChipsFactory();
        Patato patato = new Patato();
        Chips chips = chipsFactory1.masalaWafer(patato);
    }
}
