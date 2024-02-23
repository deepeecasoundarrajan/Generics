package Factory;

import Factory.Button.AndroidButton;
import Factory.Button.Button;
import Factory.DropDown.AndroidDropDown;
import Factory.DropDown.DropDown;

public class AndroidFactory extends QubitFactory{
    public Button createButton() {
        return new AndroidButton(10, "rectangle");
    }

    public DropDown createDropDown() {
        return new AndroidDropDown("list", 15);

    }
}
