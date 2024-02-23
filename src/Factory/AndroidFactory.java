package Factory;

import Factory.Button.AndroidButton;
import Factory.Button.Button;
import Factory.DropDown.AndroidDropDown;
import Factory.DropDown.DropDown;

public class AndroidFactory extends QubitFactory{
    public AndroidFactory(int buttonSize, String buttonShape, int dropdownsize, String dropformat) {
        super(buttonSize, buttonShape, dropdownsize, dropformat);
    }

    public Button createButton() {
        return new AndroidButton(buttonSize, buttonShape);
    }

    public DropDown createDropDown() {
        return new AndroidDropDown(dropformat, dropdownsize);

    }
}
