package DesignPatterns.CreationalPatterns.Factory.Chips;

public class LaysMasalaChips extends Chips{

    final static String BRAND = "Lays";
    LaysMasalaChips(Patato p, PackagingType packaging){
        super(p,packaging);
    }
    @Override
    public void addFlavour() {

    }
}
