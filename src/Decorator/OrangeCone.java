package Decorator;

public class OrangeCone extends Cone {
    IceCream ic;

    public OrangeCone() {
        super("Orange", 10);
        ic = null;
    }

    public OrangeCone(IceCream ic) {
        super(ic.getFlavor(), ic.getCost());
        this.ic = ic;
    }

    public String getFlavor() {
        if(ic == null) {
            return this.flavor;
        }
        return ic.getFlavor() + " Orange";
    }

    public int getCost() {
        if(ic == null) {
            return this.cost;
        }
        return ic.getCost() + 10;
    }
}
