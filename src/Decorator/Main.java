package Decorator;

public class Main {
    public static void main(String[] args) {
        IceCream ic = new MixedNuts(new ChocoNuts(new StrawBerryCone(new OrangeCone())));
        System.out.println(ic.getCost());
        System.out.println(ic.getFlavor());

    }
}
