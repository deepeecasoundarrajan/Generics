package Factory;

import Factory.Button.Button;
import Factory.DropDown.DropDown;

public class Main {
    public static void main(String[] args) {
        Qubit q = new Qubit("IOS", 5, 10, "square", "list");
        QubitFactory factory = q.createFactory();
        Button b = factory.createButton();
        DropDown d = factory.createDropDown();
        b.setShape();
        b.setSize();
        d.setFormat();
        d.setSize();
    }
}
