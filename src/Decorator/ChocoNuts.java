package Decorator;

public class ChocoNuts extends Toppings{
    public ChocoNuts(IceCream ic) {
        super(ic);
    }

    public String getFlavor() {
        return ic.getFlavor() + " choconuts";
    }

    public int getCost() {
        return ic.getCost() + 2;
    }
}
