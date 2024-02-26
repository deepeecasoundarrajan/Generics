package Decorator;

public abstract class Toppings implements IceCream{
    IceCream ic;

    String flavor;
    int cost;

    public Toppings(IceCream ic) {
        this.ic = ic;
    }

}
