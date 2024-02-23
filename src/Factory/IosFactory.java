package Factory;

import Factory.Button.Button;
import Factory.Button.IosButton;
import Factory.DropDown.DropDown;
import Factory.DropDown.IosDropDown;

public class IosFactory extends QubitFactory {
    public Button createButton() {
        return new IosButton(5, "square");
    }

    public DropDown createDropDown() {
        return new IosDropDown("combo", 10);
    }
}
