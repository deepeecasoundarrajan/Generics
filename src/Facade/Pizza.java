package Facade;

public class Pizza {
    int size;
    String type;
    Dominos dominos;

    public Pizza(int size, String type) {
        this.size = size;
        this.type = type;
        dominos = new Dominos(this.size, this.type);
    }

    public void makePizza() {
        dominos.bake();
        dominos.addVeggies();
        dominos.addToppings();
        dominos.pack();
    }
}
