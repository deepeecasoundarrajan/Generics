package Factory;
import Factory.Button.*;
import Factory.DropDown.*;

public abstract class QubitFactory {
    public abstract Button createButton();
    public abstract DropDown createDropDown();
}
