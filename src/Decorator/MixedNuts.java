package Decorator;

public class MixedNuts extends Toppings {
    public MixedNuts(IceCream ic) {
        super(ic);
    }

    public String getFlavor() {
        return ic.getFlavor() + " mixednuts";
    }

    public int getCost() {
        return ic.getCost() + 3;
    }
}
