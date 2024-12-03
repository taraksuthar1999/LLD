package DesignPatterns.CreationalPatterns.Factory.Chips;

public abstract class Chips {

    Patato patato;
    int quantity;
    PackagingType packagingType;

    Chips(Patato p, PackagingType packaging){
        this.patato = p;
        this.packagingType = packaging;
    }
    public void slicePatatos(){}
    public void washPatatos(){}

    public void fryPatatos(){}

    public abstract void addFlavour();

}
