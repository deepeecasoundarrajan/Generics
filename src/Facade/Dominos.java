package Facade;

public class Dominos {
    int size;
    String type;

    public Dominos(int size, String type) {
        this.size = size;
        this.type = type;
    }

    public void bake() {
        System.out.println("Baking the dough ");
    }

    public void addVeggies() {
        System.out.println("Add the vegatables ");
    }

    public void addToppings() {
        System.out.println("Add the topping ");
    }

    public void pack() {
        System.out.println("Pack the pizza ");
    }
}
