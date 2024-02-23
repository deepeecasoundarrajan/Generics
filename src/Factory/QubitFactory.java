package Factory;
import Factory.Button.*;
import Factory.DropDown.*;

public abstract class QubitFactory {
    int buttonSize;
    String buttonShape;
    int dropdownsize;
    String dropformat;

    public QubitFactory(int buttonSize, String buttonShape, int dropdownsize, String dropformat) {
        this.buttonSize = buttonSize;
        this.buttonShape = buttonShape;
        this.dropdownsize = dropdownsize;
        this.dropformat = dropformat;
    }

    public abstract Button createButton();
    public abstract DropDown createDropDown();
}
