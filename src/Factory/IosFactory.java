package Factory;

import Factory.Button.Button;
import Factory.Button.IosButton;
import Factory.DropDown.DropDown;
import Factory.DropDown.IosDropDown;

public class IosFactory extends QubitFactory {
    public IosFactory(int buttonSize, String buttonShape, int dropdownsize, String dropformat) {
        super(buttonSize, buttonShape, dropdownsize, dropformat);
    }
    public Button createButton() {
        return new IosButton(buttonSize, buttonShape);
    }

    public DropDown createDropDown() {
        return new IosDropDown(dropformat, dropdownsize);
    }
}
