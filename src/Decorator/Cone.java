package Decorator;

public abstract class Cone implements IceCream {
    String flavor;
    int cost;

    IceCream ic;

    public Cone(String flavor, int cost) {
        this.flavor = flavor;
        this.cost = 10;
    }
}
