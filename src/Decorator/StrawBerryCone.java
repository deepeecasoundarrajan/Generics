package Decorator;

public class StrawBerryCone extends Cone {
    IceCream ic;

    public StrawBerryCone() {
        super("Strawberry", 15);
    }

    public StrawBerryCone(IceCream ic) {
        super(ic.getFlavor(), ic.getCost());
        this.ic = ic;
    }

    public String getFlavor() {
        if(ic == null) {
            return this.flavor;
        }
        return ic.getFlavor() + " Strawberry";
    }

    public int getCost() {
        if(ic == null) {
            return this.cost;
        }
        return ic.getCost() + 20;
    }
}
